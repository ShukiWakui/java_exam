package com.example.test_spring_scope_shukiwakui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_scope_shukiwakui.form.Exam02Form;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
    @Autowired
    private HttpSession session;

    @ModelAttribute
    public Exam02Form setUpForm() {
        return new Exam02Form();
    }

    @RequestMapping("")
    public String index() {
        return "exam02";
    }

    @RequestMapping("/result")
    public String result(Exam02Form exam02Form) {
        session.setAttribute("leftNum", exam02Form.getIntLeftNum());
        session.setAttribute("rightNum", exam02Form.getIntRightNum());
        Integer total = exam02Form.getIntLeftNum() + exam02Form.getIntRightNum();
        session.setAttribute("total", total);
        return "exam02-result";
    }

    @RequestMapping("/result2")
    public String result2() {
        return "exam02-result2";
    }
}
