package com.example.structural.proxy;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("正在从磁盘加载图片: " + fileName);
    }
    @Override
    public void display() {
        System.out.println("显示图片: " + fileName);
    }
}
