/* eslint-disable @typescript-eslint/no-unsafe-return */
import { Controller, Get, Query } from '@nestjs/common';
import { OrderService } from './order/order.service';
import { UserService } from './user/user.service';

@Controller()
export class AppController {
  constructor(
    private readonly userService: UserService,
    private readonly orderService: OrderService,
  ) {}

  @Get('user/hello')
  async helloUser(@Query('name') name: string) {
    return this.userService.sayHello(name);
  }

  @Get('order/hello')
  async helloOrder(@Query('name') name: string) {
    return this.orderService.sayHello(name);
  }
}
