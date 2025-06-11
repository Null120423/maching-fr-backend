import { Controller } from '@nestjs/common';
import { GrpcMethod } from '@nestjs/microservices';

@Controller()
export class MatchingController {
  @GrpcMethod('MatchingService', 'FindMatches')
  findMatches(data: { activity: string; location: string }) {
    return {
      matches: [
        { id: '1', name: 'Alice', activity: data.activity },
        { id: '2', name: 'Bob', activity: data.activity },
      ],
    };
  }
}
