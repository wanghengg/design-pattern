package com.example.behavioral.chain;

public class Demo {
    public static void main(String[] args) {
        GeneralManager generalManager = new GeneralManager();
        DepartmentManager departmentManager = new DepartmentManager();
        departmentManager.setNextApprover(generalManager);
        TeamLeader teamLeader = new TeamLeader();
        teamLeader.setNextApprover(departmentManager);
        teamLeader.processRequest(1);
        teamLeader.processRequest(5);
        teamLeader.processRequest(15);
    }
}
