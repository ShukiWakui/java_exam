package com.example.test_spring_scope_shukiwakui.form;

public class Exam02Form {
    private String leftNum;
    private String rightNum;

    public String getLeftNum() {
        return leftNum;
    }

    public void setLeftNum(String leftNum) {
        this.leftNum = leftNum;
    }

    public String getRightNum() {
        return rightNum;
    }

    public void setRightNum(String rightNum) {
        this.rightNum = rightNum;
    }

    public Integer getIntLeftNum() {
        return Integer.parseInt(leftNum);
    }

    public Integer getIntRightNum() {
        return Integer.parseInt(rightNum);
    }

}
