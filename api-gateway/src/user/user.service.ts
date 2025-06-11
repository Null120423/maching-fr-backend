/* eslint-disable @typescript-eslint/require-await */
/* eslint-disable @typescript-eslint/no-unsafe-return */
import { Inject, Injectable, OnModuleInit } from '@nestjs/common';
import { ClientGrpc } from '@nestjs/microservices';

interface HelloService {
  SayHello(data: { name: string }): any;
}

@Injectable()
export class UserService implements OnModuleInit {
  private helloService: HelloService;

  constructor(@Inject('USER_PACKAGE') private client: ClientGrpc) {}

  onModuleInit() {
    this.helloService = this.client.getService<HelloService>('HelloService');
  }

  async sayHello(name: string) {
    return this.helloService.SayHello({ name });
  }
}
