package com.example.structural.proxy;

public class Demo {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("test.jpg");
        proxyImage.display();
        System.out.println("-----------------");
        proxyImage.display();
    }
}
