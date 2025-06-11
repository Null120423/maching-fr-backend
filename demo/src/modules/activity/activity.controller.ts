import { Body, Controller, Post } from '@nestjs/common';
import { ApiOperation, ApiResponse, ApiTags } from '@nestjs/swagger';
import { ActivityService } from './activity.service';

@ApiTags('Activity API')
@Controller('activity')
export class ActivityController {
  constructor(private readonly service: ActivityService) {}

  @ApiOperation({
    summary: 'Blog create',
  })
  @ApiResponse({ status: 201 })
  @Post()
  async create(@Body() body: any) {
    return {};
  }
}
