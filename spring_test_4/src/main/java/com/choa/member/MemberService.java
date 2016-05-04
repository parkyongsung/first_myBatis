package com.choa.member;

public interface MemberService {

	//회원가입
	public void memberJoin(MemberDTO memberDTO);
	//로그인
	public void memberLogin(MemberDTO memberDTO);
	
}
