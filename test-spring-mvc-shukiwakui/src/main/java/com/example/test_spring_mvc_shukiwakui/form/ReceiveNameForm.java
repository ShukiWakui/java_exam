package com.example.test_spring_mvc_shukiwakui.form;

public class ReceiveNameForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReceiveNameForm [name=" + name + "]";
    }

}
