package com.example.structural.composite;

/**
 * 组合模式（Composite Pattern）是一种结构型设计模式，它将对象组合成树形结构以表示 “部分 - 整体” 的层次结构，
 * 使得用户对单个对象和组合对象的使用具有一致性。在组合模式中，存在两种类型的对象：叶子对象（没有子对象）和组合
 * 对象（包含子对象）。客户端可以统一地对待这两种对象，无需区分是操作单个对象还是组合对象，从而简化了客户端代码，
 * 并更容易扩展和维护复杂的对象层次结构。
 */
public abstract class OrganizationComponent {
    protected String name;

    protected String description;

    public OrganizationComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public abstract void display();
}
