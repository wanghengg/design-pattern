package com.example.chain;

public class DepartmentManager extends Approver {
    @Override
    public void processRequest(int days) {
        if (days > 3 && days <= 10) {
            System.out.println("部门经理批准了你的请假申请，请假天数：" + days + " 天。");
        } else if (nextApprover != null) {
            nextApprover.processRequest(days);
        } else {
            System.out.println("请假天数超出了部门经理的处理范围。");
        }
    }
}
