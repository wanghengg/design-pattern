package com.example.structural.adpater;

/**
 * 适配器模式（Adapter Pattern）是一种结构型设计模式，它的作用是将一个类的接口转换成客户希望的另一个接口。
 * 适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以协同工作。适配器模式有两种类型：对象适配器
 * （使用组合关系）和类适配器（使用继承关系，在 Java 中由于单继承限制使用相对较少），下面主要介绍对象适配器的示例。
 */

// 目标对象
interface AudioPlayer {
    void play(String audioType, String fileName);
}
