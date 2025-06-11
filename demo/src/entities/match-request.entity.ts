import { Column, Entity, ManyToOne } from 'typeorm';
import { BaseEntityCustom } from './base.entity';
import { UserEntity } from './user.entity';

@Entity('MatchRequests')
export class MatchRequestEntity extends BaseEntityCustom {
  @ManyToOne(() => UserEntity)
  sender: UserEntity;

  @ManyToOne(() => UserEntity)
  receiver: UserEntity;

  @Column({ default: 'pending' })
  status: 'pending' | 'accepted' | 'rejected';

  @Column({ nullable: true })
  scheduledTime: Date; // Lịch hẹn nếu có

  @Column({ nullable: true })
  locationNote: string; // Gợi ý địa điểm
}
