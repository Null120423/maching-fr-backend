import { Module } from '@nestjs/common';
import { TypeOrmExModule } from 'src/typeorm';
import { ActivityController } from './activity.controller';
import { ActivityService } from './activity.service';

@Module({
  imports: [TypeOrmExModule.forCustomRepository([])],
  providers: [ActivityService],
  controllers: [ActivityController],
  exports: [ActivityService],
})
export class ActivityModule {}
