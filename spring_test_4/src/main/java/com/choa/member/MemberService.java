package com.choa.member;

import org.springframework.ui.Model;

public interface MemberService {

	//회원가입
	public String memberJoin(MemberDTO memberDTO, Model model);
	//로그인
	public void memberLogin(MemberDTO memberDTO);
	
}
