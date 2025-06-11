import { compare, hash } from 'bcrypt';
import { BeforeInsert, BeforeUpdate, Column, Entity, OneToOne } from 'typeorm';
import { BaseEntityCustom } from './base.entity';
import { UserDetailEntity } from './userDetail.entity';
@Entity(`Users`)
export class UserEntity extends BaseEntityCustom {
  @Column({ length: 500 })
  username: string;

  @Column({ length: 500 })
  email: string;

  @Column({ length: 500 })
  password: string;

  @Column()
  avatar: string;

  @Column({
    nullable: true,
  })
  verifyAt: Date;

  @Column({
    nullable: true,
  })
  verifyCode: string;

  @Column()
  isActive: boolean;

  @Column({
    default: false,
  })
  isUpdateDetail: boolean;

  @Column({
    nullable: true,
  })
  verifyExpiredTime: Date;

  @BeforeInsert()
  @BeforeUpdate()
  async hashPassword() {
    if (this.password && !this.password.startsWith('$2b$')) {
      const hashedPassword = await hash(this.password, 10);
      this.password = hashedPassword;
    }
  }

  comparePassword(candidate: string) {
    console.log('Candidate Password:', candidate);
    console.log('Stored Password:', this.password);
    return compare(candidate, this.password);
  }
  @OneToOne(() => UserDetailEntity, (userDetail) => userDetail.user)
  userDetail: Promise<UserDetailEntity>;
}
