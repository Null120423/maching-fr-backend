import { NestFactory } from '@nestjs/core';
import { MicroserviceOptions, Transport } from '@nestjs/microservices';
import { join } from 'path';
import { AppModule } from './app.module';

async function bootstrap() {
  const app = await NestFactory.createMicroservice<MicroserviceOptions>(
    AppModule,
    {
      transport: Transport.GRPC,
      options: {
        package: 'hello',
        protoPath: join(__dirname, '../../proto/hello.proto'),
        url: '0.0.0.0:50052',
      },
    },
  );

  await app.listen();
  console.log('gRPC Microservice is running on port 50052');
}
bootstrap();
