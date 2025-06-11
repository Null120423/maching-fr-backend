import { Controller } from '@nestjs/common';
import { GrpcMethod } from '@nestjs/microservices';
import { AppService } from './app.service';
interface HelloRequest {
  name: string;
}

interface HelloResponse {
  message: string;
}

@Controller()
export class AppController {
  constructor(private readonly appService: AppService) {}

  @GrpcMethod('HelloService', 'SayHello')
  sayHello(data: HelloRequest): HelloResponse {
    return this.appService.sayHello(data);
  }
}
