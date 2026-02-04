package com.example.test_spring_mvc_shukiwakui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class ReceiveNameController {
    
    @RequestMapping("")
    public String index() {
        return "name-form";
    }

    @RequestMapping("/finished")
    public String finished(String name) {
        System.out.println("入力された値は" + name + "です。");
        return "finished";
    }
}
