import { Body, Controller, Post } from '@nestjs/common';
import { ApiOperation, ApiResponse, ApiTags } from '@nestjs/swagger';
import { NotificationService } from './notification.service';

@ApiTags('Notification API')
@Controller('notification')
export class NotificationController {
  constructor(private readonly service: NotificationService) {}

  @ApiOperation({
    summary: '',
  })
  @ApiResponse({ status: 201 })
  @Post()
  async create(@Body() body: any) {
    return {};
  }
}
