package com.example.behavioral.chain;

public class GeneralManager extends Approver {
    @Override
    public void processRequest(int days) {
        if (days > 10) {
            System.out.println("总经理批准了你的请假申请，请假天数：" + days + " 天。");
        } else if (nextApprover != null) {
            nextApprover.processRequest(days);
        }
    }
}
