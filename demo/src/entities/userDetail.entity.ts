import { Column, Entity, JoinColumn, OneToOne } from 'typeorm';
import { BaseEntityCustom } from './base.entity';
import { UserEntity } from './user.entity';

/** Thông tin chi tiết của người dùng dùng cho ứng dụng du lịch */
@Entity('user_details')
export class UserDetailEntity extends BaseEntityCustom {
  /** Họ và tên */
  @Column()
  fullName: string;

  /** Địa chỉ hiện tại */
  @Column({ nullable: true })
  address: string;

  /** Số điện thoại */
  @Column({ nullable: true })
  phoneNumber: string;

  /** Email */
  @Column({ nullable: true })
  email: string;

  /** Liên kết GitHub */
  @Column({ nullable: true })
  githubLink: string;

  /** Liên kết Telegram */
  @Column({ nullable: true })
  telegramLink: string;

  /** Liên kết Facebook */
  @Column({ nullable: true })
  facebookLink: string;

  /** Tiểu sử / mô tả ngắn về bản thân */
  @Column({ type: 'text', nullable: true })
  bio: string;

  /** Ảnh đại diện */
  @Column({ type: 'varchar', nullable: true })
  avatar: string;

  /** Ngày sinh */
  @Column({ type: 'date', nullable: true })
  birthDate: Date | null;

  @Column({ nullable: true })
  gender: 'male' | 'female' | 'other';

  @Column({ nullable: true })
  age: number;

  @Column()
  favoriteActivity: string; // Ví dụ: 'Cà phê', 'Chạy bộ'

  @Column()
  availableTimeSlot: string; // Ví dụ: 'Sáng', 'Chiều', 'Tối'

  @Column()
  latitude: number;

  @Column()
  longitude: number;

  /** ID người dùng liên kết */
  @Column({ type: 'varchar' })
  userId: string;

  /** Mối quan hệ 1-1 với bảng người dùng chính */
  @OneToOne(() => UserEntity, (user) => user.userDetail)
  @JoinColumn({ name: 'userId', referencedColumnName: 'id' })
  user: Promise<UserEntity>;
}
