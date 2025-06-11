package com.example.order_service.controller;

import hello.HelloRequest;
import hello.HelloServiceGrpc;
import hello.HelloReply;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

    @GrpcClient("local-grpc-server") 
    private HelloServiceGrpc.HelloServiceBlockingStub helloServiceBlockingStub;

    @GetMapping()
    public String sayHello(@RequestParam(defaultValue = "World") String name) {
        HelloRequest request = HelloRequest.newBuilder()
                .setName(name)
                .build();

        HelloReply response = helloServiceBlockingStub.sayHello(request);
        return response.getMessage();
    }
}
