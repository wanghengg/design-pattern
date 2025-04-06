package com.example.structural.composite;

public class Employee extends OrganizationComponent {
    public Employee(String name, String position) {
        super(name, position);
    }

    @Override
    public void display() {
        System.out.println("员工：" + getName() + "，描述：" + getDescription());
    }
}
