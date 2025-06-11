import { Column, Entity } from 'typeorm';
import { BaseEntityCustom } from './base.entity';

@Entity('Activities')
export class ActivityEntity extends BaseEntityCustom {
  @Column()
  name: string; // 'Cà phê', 'Chạy bộ'

  @Column()
  iconUrl: string; // Dùng cho mobile UI
}
