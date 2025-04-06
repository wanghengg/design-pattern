package com.example.structural.composite;

public class Demo {
    public static void main(String[] args) {
        Department company = new Department("公司总部", "公司最高管理机构");

        Department hrDepartment = new Department("人力资源部", "负责人力资源管理");
        Department itDepartment = new Department("信息技术部", "负责技术支持");

        Employee employee1 = new Employee("张三", "人力资源专员");
        Employee employee2 = new Employee("李四", "软件工程师");

        hrDepartment.add(employee1);
        itDepartment.add(employee2);

        company.add(hrDepartment);
        company.add(itDepartment);

        company.display();
    }
}
