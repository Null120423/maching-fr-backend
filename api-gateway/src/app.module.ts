import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AuthModule } from './auth/auth.module';
import { PaymentModule } from './payment/payment.module';

@Module({
  imports: [PaymentModule, AuthModule],
  controllers: [AppController],
  providers: [],
})
export class AppModule {}
