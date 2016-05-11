package com.choa.test4;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.choa.member.MemberDTO;
import com.choa.member.MemberServiceImpl;



@Controller
@RequestMapping(value="/member")
public class MemberController {
	
	@Autowired
	private MemberServiceImpl member;
	
	@RequestMapping(value="/login.do")
	public String login(){
		System.out.println("test");
			System.out.println(member);
			member.test();
			
		return "redirect:/";
	}
	
	@RequestMapping(value="/joinform.do")
	//void 일경우 요청하는 주소.jsp
	public void joinForm(){
		
	}
	@RequestMapping(value="/loginform.do")
	//void 일경우 요청하는 주소.jsp
	public void loginForm(){
		
		
	}
	@RequestMapping("/join.do")
	public String join(MemberDTO memberDTO, Model model){
	String message = member.memberJoin(memberDTO, model);
		//model.addAttribute("message", message);
		return "redirect:/";
	}
	
}
