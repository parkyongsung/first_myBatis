package com.choa.test4;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;
import com.choa.member.MemberServiceImpl;

@Controller
public class MemberController {
	
	@Autowired
	MemberServiceImple ms = new MemberController()
	
	@RequestMapping(value="join.do")
	public String join(MemberDTO memberDTO){
	
		
		return "";
	}
}
