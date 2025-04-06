package com.example.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        components.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        components.remove(organizationComponent);
    }

    @Override
    public void display() {
        System.out.println("部门：" + getName() + "，描述：" + getDescription());
        for (OrganizationComponent component : components) {
            component.display();
        }
    }
}
