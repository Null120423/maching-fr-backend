import { Module } from '@nestjs/common';
import { ClientsModule, Transport } from '@nestjs/microservices';
import { join } from 'path';
import { AppController } from './app.controller';
import { OrderService } from './order/order.service';
import { PaymentModule } from './payment/payment.module';
import { UserService } from './user/user.service';

@Module({
  imports: [
    ClientsModule.register([
      {
        name: 'USER_PACKAGE',
        transport: Transport.GRPC,
        options: {
          package: 'hello',
          protoPath: join(__dirname, '../../proto/hello.proto'),
          url: '0.0.0.0:50052',
        },
      },
      {
        name: 'ORDER_PACKAGE',
        transport: Transport.GRPC,
        options: {
          package: 'hello',
          protoPath: join(__dirname, '../../proto/hello.proto'),
          url: 'localhost:50051',
        },
      },
    ]),
    PaymentModule,
  ],
  controllers: [AppController],
  providers: [UserService, OrderService],
})
export class AppModule {}
