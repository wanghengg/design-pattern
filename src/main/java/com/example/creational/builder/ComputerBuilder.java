package com.example.creational.builder;

/**
 * 外观模式（Facade Pattern）是一种结构型设计模式，它为子系统中的一组接口提供一个统一的高层接口，使子系统更容易使用。
 * 外观模式通过引入一个外观类，将子系统的复杂操作封装起来，客户端只需要与外观类进行交互，而无需了解子系统内部的具体实现
 * 细节，从而降低了客户端与子系统之间的耦合度，提高了系统的可维护性和可扩展性。
 */
public abstract class ComputerBuilder {
    protected Computer computer = new Computer();

    public abstract ComputerBuilder buildCPU();
    public abstract ComputerBuilder buildMemory();
    public abstract ComputerBuilder buildHardDisk();

    public Computer build() {
        return computer;
    }
}
