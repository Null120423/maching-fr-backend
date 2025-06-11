// gateway-api/src/match.controller.ts
import { Controller, Get, OnModuleInit, Query } from '@nestjs/common';
import { ClientGrpc, Inject } from '@nestjs/microservices';
import { Observable } from 'rxjs';

interface Match {
  id: string;
  name: string;
  activity: string;
}

interface MatchingService {
  FindMatches(data: {
    activity: string;
    location: string;
  }): Observable<{ matches: Match[] }>;
}

@Controller('match')
export class MatchController implements OnModuleInit {
  private matchingService: MatchingService;

  constructor(@Inject('MATCH_SERVICE') private client: ClientGrpc) {}

  onModuleInit() {
    this.matchingService =
      this.client.getService<MatchingService>('MatchingService');
  }

  @Get()
  async getMatches(
    @Query('activity') activity: string,
    @Query('location') location: string,
  ) {
    return this.matchingService.FindMatches({ activity, location }).toPromise();
  }
}
