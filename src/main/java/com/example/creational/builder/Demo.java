package com.example.creational.builder;

public class Demo {
    public static void main(String[] args) {
        HighEndComputerBuilder builder = new HighEndComputerBuilder();
        Computer computer = builder.buildCPU().buildMemory().buildHardDisk().build();
        System.out.println(computer);
    }
}
