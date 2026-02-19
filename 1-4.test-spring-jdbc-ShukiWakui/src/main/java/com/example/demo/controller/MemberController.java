package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;

@Controller
@RequestMapping("/member")
public class MemberController {
	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		List<Member> memberList = repository.findAll();
		for (Member member : memberList) {
			System.out.println(member);
		}
		System.out.println("-----------------------------------------------");

		Member jiro = repository.load(2);
		System.out.println(jiro);

		System.out.println("-----------------------------------------------");

		Member wakui = new Member();
		wakui.setName("和久井柊希");
		wakui.setAge(24);
		wakui.setDepId(2);
		repository.save(wakui);

		System.out.println("-----------------------------------------------");

		jiro.setName("シロー");
		repository.save(jiro);

		return "member";
	}
}
