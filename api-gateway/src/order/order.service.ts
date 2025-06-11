/* eslint-disable @typescript-eslint/no-unsafe-return */
/* eslint-disable @typescript-eslint/require-await */
import { Inject, Injectable, OnModuleInit } from '@nestjs/common';
import { ClientGrpc } from '@nestjs/microservices';

interface HelloService {
  SayHello(data: { name: string }): any;
}

@Injectable()
export class OrderService implements OnModuleInit {
  private helloService: HelloService;

  constructor(@Inject('ORDER_PACKAGE') private client: ClientGrpc) {}

  onModuleInit() {
    this.helloService = this.client.getService<HelloService>('HelloService');
  }

  async sayHello(name: string) {
    return this.helloService.SayHello({ name });
  }
}
