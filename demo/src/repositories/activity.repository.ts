import { ActivityEntity, MatchRequestEntity } from 'src/entities';
import { CustomRepository } from 'src/typeorm/typeorm-decorater';
import { Repository } from 'typeorm';

@CustomRepository(ActivityEntity)
export class ActivityRepository extends Repository<ActivityEntity> {}
@CustomRepository(MatchRequestEntity)
export class MatchRequestRepository extends Repository<MatchRequestEntity> {}
