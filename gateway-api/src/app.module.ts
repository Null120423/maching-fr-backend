// gateway-api/src/app.module.ts
import { Module } from '@nestjs/common';
import { ClientsModule, Transport } from '@nestjs/microservices';
import { join } from 'path';
import { MatchingController } from './match/maching.controller';

@Module({
  imports: [
    ClientsModule.register([
      {
        name: 'MATCH_SERVICE',
        transport: Transport.GRPC,
        options: {
          package: 'matching',
          protoPath: join(__dirname, '../protos/matching.proto'),
        },
      },
    ]),
  ],
  controllers: [MatchingController],
})
export class AppModule {}
