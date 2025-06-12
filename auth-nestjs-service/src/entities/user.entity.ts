import { compare, hash } from 'bcrypt';
import { BeforeInsert, BeforeUpdate, Column, Entity } from 'typeorm';
import { BaseEntityCustom } from './base.entity';

@Entity(`Users`)
export class UserEntity extends BaseEntityCustom {
  @Column({ length: 500 })
  username: string;

  @Column({ length: 500 })
  password: string;

  @Column({ length: 500, nullable: true })
  avatar: string; // Assuming avatar is a URL or file path

  // Use 'simple-array' for storing string[] in the DB as serialized array
  @Column('simple-array', { nullable: true })
  favoriteActivities: string[];

  // Similar to favoriteActivities, store available time slots as a serialized array
  @Column('simple-array', { nullable: true })
  availableTimeSlots: string[];

  @Column({
    type: 'timestamp',
    nullable: true,
  })
  location: Date; // Assuming location is a timestamp, but adjust as needed

  // Lifecycle hook to hash the password before insert or update
  @BeforeInsert()
  @BeforeUpdate()
  async hashPassword() {
    if (this.password && !this.password.startsWith('$2b$')) {
      const hashedPassword = await hash(this.password, 10);
      this.password = hashedPassword;
    }
  }

  // Compare given password with the stored hashed password
  comparePassword(candidate: string) {
    console.log('Candidate Password:', candidate);
    console.log('Stored Password:', this.password);
    return compare(candidate, this.password);
  }
}
