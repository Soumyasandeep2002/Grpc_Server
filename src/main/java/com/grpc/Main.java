package com.grpc;

import com.grpc.service.UserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class Main {
    public static void main(String[] args) throws Exception  {

        System.out.println("starting GRPC Server");
        Server server = ServerBuilder.forPort(9090).addService(

                new UserService()).build();

        server.start();
        System.out.println("server started at "+ server.getPort());
        server.awaitTermination();
    }
}