package com.example.structural.proxy;

public class ProxyImage implements Image {
    private final String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        System.out.println("前置处理");
        realImage.display();
        System.out.println("后置处理");
    }
}
