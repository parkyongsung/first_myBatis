package com.choa.member;

import org.springframework.stereotype.Repository;

@Repository
public class MemberServiceImpl implements MemberService {

	@Override
	public void memberJoin(MemberDTO memberDTO) {
		// DAO의 회원가입하는 메서드를 호출

	}

	@Override
	public void memberLogin(MemberDTO memberDTO) {
		// DAO의 로그인 하는 메서드 호출

	}

}
