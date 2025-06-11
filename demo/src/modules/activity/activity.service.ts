import { Injectable } from '@nestjs/common';
import { ConfigService } from '@nestjs/config';

@Injectable()
export class ActivityService {
  constructor(public readonly configService: ConfigService) {}
  async create(body: any) {}
}
