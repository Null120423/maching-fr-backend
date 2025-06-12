import {
  Injectable,
  NotFoundException,
  UnauthorizedException,
} from '@nestjs/common';
import { JwtService } from '@nestjs/jwt';
import { UserRepository } from 'src/repositories/user.repository';

import { ConfigService } from '@nestjs/config';
import { UserEntity } from 'src/entities';
import {
  LoginRequestDTO,
  RefreshTokenRequestDTO,
  SignUpRequestDTO,
} from './dto';

@Injectable()
export class AuthService {
  constructor(
    private repo: UserRepository,
    private jwtService: JwtService,
    private readonly configService: ConfigService,
  ) {}

  JWT_SECRET = 'JWT_SECRET';

  async signIn(signInDto: LoginRequestDTO) {
    const user: any = await this.repo.findOne({
      where: [{ username: signInDto.username, isDeleted: false }],
    });

    if (!user) {
      throw new NotFoundException('User not found!');
    }
    if (!user.isActive) {
      throw new UnauthorizedException('User not active!');
    }
    if (!user.verifyAt) {
      throw new UnauthorizedException('User not verified!');
    }

    const isMatch = await user.comparePassword(signInDto.password);
    if (!isMatch) {
      throw new UnauthorizedException('Password incorrect!');
    }

    const payload = {
      uid: user.id,
    };
    const accessToken = this.jwtService.sign(payload);

    const refreshPayload = {
      uid: user.id,
    };
    const refreshToken = this.jwtService.sign(refreshPayload, {
      expiresIn: '7d',
    });

    const userDetail = user.__userDetail__;
    delete user.__userDetail__;
    delete user.password;

    return {
      accessToken,
      refreshToken,
      user: { ...user, userDetail },
    };
  }

  async signUp(signUpDTO: SignUpRequestDTO) {
    if (await this.repo.findOneBy({ username: signUpDTO.username })) {
      throw new UnauthorizedException('User already exists!');
    }

    if (signUpDTO.password !== signUpDTO.confirmPassword) {
      throw new UnauthorizedException('Password not match!');
    }

    const newUser = new UserEntity();
    newUser.username = signUpDTO.username;
    newUser.password = signUpDTO.password;

    await this.repo.insert(newUser);

    return {
      message: 'User registered successfully!',
    };
  }

  async checkUserExist(username: string): Promise<boolean> {
    const user = await this.repo.findOneBy({ username });
    return !!user;
  }

  async refreshToken(data: RefreshTokenRequestDTO) {
    if (!this.JWT_SECRET) {
      throw new UnauthorizedException('JWT_SECRET not found!');
    }
    const { id } = this.jwtService.verify(data.refreshToken, {
      secret: this.JWT_SECRET,
    });
    const user: any = await this.repo.findOne({
      where: { id },
    });
    if (!user) throw new UnauthorizedException('User not found!');

    const payload = {
      uid: user.id,
    };
    const accessToken = this.jwtService.sign(payload);

    const refreshPayload = {
      uid: user.id,
    };
    const refreshToken = this.jwtService.sign(refreshPayload, {
      expiresIn: '7d',
    });

    if (!user) {
      throw new UnauthorizedException('User not found!');
    }

    /// delay 3s
    return {
      accessToken,
      refreshToken,
      user: { ...user },
    };
  }

  async getUserById(id: string) {
    const user = await this.repo.findOneBy({ id });
    if (!user) throw new NotFoundException('User not found!');
    return user;
  }
}
