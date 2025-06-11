import { MigrationInterface, QueryRunner } from "typeorm";

export class Init1749602987518 implements MigrationInterface {
    name = 'Init1749602987518'

    public async up(queryRunner: QueryRunner): Promise<void> {
        await queryRunner.query(`CREATE TABLE "Users" ("id" uuid NOT NULL DEFAULT uuid_generate_v4(), "createdAt" TIMESTAMP NOT NULL DEFAULT now(), "createdBy" character varying, "createdByName" character varying(50), "updatedAt" TIMESTAMP NOT NULL DEFAULT now(), "updatedBy" character varying, "deleteBy" character varying, "isDeleted" boolean NOT NULL DEFAULT false, "username" character varying(500) NOT NULL, "email" character varying(500) NOT NULL, "password" character varying(500) NOT NULL, "avatar" character varying NOT NULL, "verifyAt" TIMESTAMP, "verifyCode" character varying, "isActive" boolean NOT NULL, "isUpdateDetail" boolean NOT NULL DEFAULT false, "verifyExpiredTime" TIMESTAMP, CONSTRAINT "PK_16d4f7d636df336db11d87413e3" PRIMARY KEY ("id"))`);
        await queryRunner.query(`CREATE TABLE "user_details" ("id" uuid NOT NULL DEFAULT uuid_generate_v4(), "createdAt" TIMESTAMP NOT NULL DEFAULT now(), "createdBy" character varying, "createdByName" character varying(50), "updatedAt" TIMESTAMP NOT NULL DEFAULT now(), "updatedBy" character varying, "deleteBy" character varying, "isDeleted" boolean NOT NULL DEFAULT false, "fullName" character varying NOT NULL, "address" character varying, "phoneNumber" character varying, "email" character varying, "githubLink" character varying, "telegramLink" character varying, "facebookLink" character varying, "bio" text, "avatar" character varying, "birthDate" date, "gender" character varying, "age" integer, "favoriteActivity" character varying NOT NULL, "availableTimeSlot" character varying NOT NULL, "latitude" integer NOT NULL, "longitude" integer NOT NULL, "userId" uuid NOT NULL, CONSTRAINT "REL_5261d2468b1288b347d58e8b54" UNIQUE ("userId"), CONSTRAINT "PK_fb08394d3f499b9e441cab9ca51" PRIMARY KEY ("id"))`);
        await queryRunner.query(`CREATE TABLE "Activities" ("id" uuid NOT NULL DEFAULT uuid_generate_v4(), "createdAt" TIMESTAMP NOT NULL DEFAULT now(), "createdBy" character varying, "createdByName" character varying(50), "updatedAt" TIMESTAMP NOT NULL DEFAULT now(), "updatedBy" character varying, "deleteBy" character varying, "isDeleted" boolean NOT NULL DEFAULT false, "name" character varying NOT NULL, "iconUrl" character varying NOT NULL, CONSTRAINT "PK_68241637da2837e6d5a4db6f806" PRIMARY KEY ("id"))`);
        await queryRunner.query(`CREATE TABLE "MatchRequests" ("id" uuid NOT NULL DEFAULT uuid_generate_v4(), "createdAt" TIMESTAMP NOT NULL DEFAULT now(), "createdBy" character varying, "createdByName" character varying(50), "updatedAt" TIMESTAMP NOT NULL DEFAULT now(), "updatedBy" character varying, "deleteBy" character varying, "isDeleted" boolean NOT NULL DEFAULT false, "status" character varying NOT NULL DEFAULT 'pending', "scheduledTime" TIMESTAMP, "locationNote" character varying, "senderId" uuid, "receiverId" uuid, CONSTRAINT "PK_a5a38c67c1601e9a6345fb00b0b" PRIMARY KEY ("id"))`);
        await queryRunner.query(`ALTER TABLE "user_details" ADD CONSTRAINT "FK_5261d2468b1288b347d58e8b540" FOREIGN KEY ("userId") REFERENCES "Users"("id") ON DELETE NO ACTION ON UPDATE NO ACTION`);
        await queryRunner.query(`ALTER TABLE "MatchRequests" ADD CONSTRAINT "FK_eff58bb7579b93c87a0343d5f98" FOREIGN KEY ("senderId") REFERENCES "Users"("id") ON DELETE NO ACTION ON UPDATE NO ACTION`);
        await queryRunner.query(`ALTER TABLE "MatchRequests" ADD CONSTRAINT "FK_d95470cb771310e90bfa14d1ee0" FOREIGN KEY ("receiverId") REFERENCES "Users"("id") ON DELETE NO ACTION ON UPDATE NO ACTION`);
    }

    public async down(queryRunner: QueryRunner): Promise<void> {
        await queryRunner.query(`ALTER TABLE "MatchRequests" DROP CONSTRAINT "FK_d95470cb771310e90bfa14d1ee0"`);
        await queryRunner.query(`ALTER TABLE "MatchRequests" DROP CONSTRAINT "FK_eff58bb7579b93c87a0343d5f98"`);
        await queryRunner.query(`ALTER TABLE "user_details" DROP CONSTRAINT "FK_5261d2468b1288b347d58e8b540"`);
        await queryRunner.query(`DROP TABLE "MatchRequests"`);
        await queryRunner.query(`DROP TABLE "Activities"`);
        await queryRunner.query(`DROP TABLE "user_details"`);
        await queryRunner.query(`DROP TABLE "Users"`);
    }

}
