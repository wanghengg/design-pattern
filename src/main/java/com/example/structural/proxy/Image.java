package com.example.structural.proxy;

/**
 * 代理模式（Proxy Pattern）是一种结构型设计模式，它为其他对象提供一种代理以控制对这个对象的访问。
 * 代理对象在客户端和目标对象之间起到中介作用，可以在不修改目标对象代码的情况下，对目标对象的访问进
 * 行控制、增强或修改等操作。常见的应用场景包括远程代理（访问远程对象）、虚拟代理（延迟加载对象）、
 * 保护代理（控制对对象的访问权限）等。
 */
public interface Image {
    void display();
}
