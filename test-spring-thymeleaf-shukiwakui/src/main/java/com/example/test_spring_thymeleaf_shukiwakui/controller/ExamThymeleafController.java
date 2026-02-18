package com.example.test_spring_thymeleaf_shukiwakui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_thymeleaf_shukiwakui.domain.Member;

@Controller
@RequestMapping("/exam")
public class ExamThymeleafController {
    @RequestMapping("")
    public String index() {
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/result")
    public String result(String name, String age, String hobby1, String hobby2, String hobby3, Model model) {
        Member member = new Member();
        member.setName(name);
        member.setAge(Integer.parseInt(age));
        List<String> hobbyList = new ArrayList<>();
        hobbyList.add(hobby1);
        hobbyList.add(hobby2);
        hobbyList.add(hobby3);
        member.setHobbyList(hobbyList);
        model.addAttribute("member", member);
        return "ex-thymeleaf-result";
    }
}
