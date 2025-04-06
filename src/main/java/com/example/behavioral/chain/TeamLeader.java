package com.example.behavioral.chain;

public class TeamLeader extends Approver {
    @Override
    public void processRequest(int days) {
        if (days <= 3) {
            System.out.println("组长批准了你的请假申请，请假天数：" + days + " 天。");
        } else if (nextApprover != null) {
            nextApprover.processRequest(days);
        } else {
            System.out.println("请假天数超出了组长的处理范围。");
        }
    }
}
