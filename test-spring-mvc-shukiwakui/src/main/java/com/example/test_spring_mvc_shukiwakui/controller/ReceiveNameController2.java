package com.example.test_spring_mvc_shukiwakui.controller;

import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_shukiwakui.form.ReceiveNameForm;

@Controller
@RequestMapping("/exam04")
public class ReceiveNameController2 {

    // @ModelAttribute
    // public ReceiveNameForm setUpForm() {
    //     return new ReceiveNameForm();
    // }
    
    @RequestMapping("")
    public String index() {
        return "name-form2";
    }

    @RequestMapping("/finished")
    public String finished(ReceiveNameForm receiveNameForm) {
        System.out.println("入力された値は" + receiveNameForm.getName() + "です。");
        return "finished";
    }
}
