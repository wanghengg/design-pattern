package com.example.observer;

/**
 * 观察者模式（Observer Pattern）是一种行为型设计模式，它定义了一种一对多的依赖关系，
 * 让多个观察者对象同时监听某一个主题对象，当主题对象发生变化时，它的所有依赖者（观察者）都会收到通知并自动更新。
 * 观察者模式通常用于实现事件驱动的系统，例如GUI应用程序中的事件处理、消息队列中的消息传递等。
 * 观察者模式可以使系统更加灵活、可扩展和易于维护。
 * 观察者模式通常包含以下几个角色：
 * 1. Subject（主题）：主题是被观察的对象，它维护一个观察者列表，并提供添加、删除和通知观察者的方法。
 * 2. Observer（观察者）：观察者是实现了特定接口的对象，它定义了一个更新方法，当主题发生变化时，它会被通知并执行更新操作。
 * 3. ConcreteSubject（具体主题）：具体主题是主题的具体实现，它维护一个观察者列表，并提供添加、删除和通知观察者的方法。
 * 4. ConcreteObserver（具体观察者）：具体观察者是观察者的具体实现，它定义了一个更新方法，当主题发生变化时，它会被通知并执行更新操作。
 * 观察者模式通常用于实现事件驱动的系统，例如GUI应用程序中的事件处理、消息队列中的消息传递等。
 * 观察者模式可以使系统更加灵活、可扩展和易于维护。
 */
public interface Observer {
    // 观察者接口
    void update(float temperature, float humidity, float pressure);
}
