package com.designpatterns.factory;

public class Runner {
    public static void main(String[] args) {
        Computer pc =ComputerFactory.getComputer("pc","2GB","500GB","2.4 Ghz");
        Computer server =ComputerFactory.getComputer("server","12GB","5TB","2.9 Ghz");
        System.out.println("Pc is :"+pc);
        System.out.println("Server is :"+server);
    }
}
