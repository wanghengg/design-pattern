package com.example.creational.builder;

public class HighEndComputerBuilder extends ComputerBuilder {
    @Override
    public ComputerBuilder buildCPU() {
        this.computer.setCpu("Intel i9");
        return this;
    }

    @Override
    public ComputerBuilder buildMemory() {
        this.computer.setMemory("16GB");
        return this;
    }

    @Override
    public ComputerBuilder buildHardDisk() {
        this.computer.setHardDisk("1TB SSD");
        return this;
    }
}
