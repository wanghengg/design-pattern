package com.example.chain;

/**
 * 责任链模式（Chain of Responsibility Pattern）是一种行为型设计模式，它将请求的发送者和接收者解耦，
 * 使多个对象都有机会处理这个请求。这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
 * 责任链模式的核心在于，每个处理者都包含对下一个处理者的引用，当一个处理者不能处理请求时，就将请求传递给下一个处理者，形成一个链式的处理流程。
 */
abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(int days);
}
