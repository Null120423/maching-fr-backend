import { Inject, Injectable, OnModuleInit } from '@nestjs/common';
import { ClientGrpc } from '@nestjs/microservices';
import {
  LoginReplyDTO,
  LoginRequestDTO,
  RefreshTokenReplyDTO,
  RefreshTokenRequestDTO,
  SignUpReplyDTO,
  SignUpRequestDTO,
} from './dto';

interface AuthServiceImpl {
  SignIn(data: LoginRequestDTO): Promise<LoginReplyDTO>;
  SignUp(data: SignUpRequestDTO): Promise<SignUpReplyDTO>;
  RefreshToken(data: RefreshTokenRequestDTO): Promise<RefreshTokenReplyDTO>;
}

@Injectable()
export class AuthService implements OnModuleInit {
  private authService: AuthServiceImpl;

  constructor(@Inject('AUTH_PACKAGE') private client: ClientGrpc) {}

  onModuleInit() {
    this.authService = this.client.getService<AuthServiceImpl>('AuthService');
  }

  // Method for user login
  async signIn(data: LoginRequestDTO): Promise<LoginReplyDTO> {
    const response = await this.authService.SignIn(data);
    return response;
  }

  // Method for user sign-up
  async signUp(data: SignUpRequestDTO): Promise<SignUpReplyDTO> {
    const response = await this.authService.SignUp(data);
    return response;
  }

  // Method for refreshing the access token
  async refreshToken(
    data: RefreshTokenRequestDTO,
  ): Promise<RefreshTokenReplyDTO> {
    const response = await this.authService.RefreshToken(data);
    return response;
  }
}
