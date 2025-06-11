mport { Controller, Get, Query } from '@nestjs/common';
import { ClientGrpc, Inject } from '@nestjs/microservices';
import { from, Observable } from 'rxjs';
import { Controller, Get, OnModuleInit, Query } from '@nestjs/common';

interface Match {
  id: string;
  name: string;
  activity: string;
}

interface MatchingService {
  FindMatches(data: { activity: string; location: string }): Observable<{ matches: Match[] }>;
}

@Controller('match')
export class MatchController implements OnModuleInit {
  private matchingService: MatchingService;

  constructor(@Inject('MATCH_SERVICE') private client: ClientGrpc) {}

  onModuleInit() {
    this.matchingService = this.client.getService<MatchingService>('MatchingService');
  }

  @Get()
  async getMatches(@Query('activity') activity: string, @Query('location') location: string) {
    return this.matchingService.FindMatches({ activity, location }).toPromise();
  }
}