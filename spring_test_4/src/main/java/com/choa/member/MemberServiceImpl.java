package com.choa.member;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAOImpl memberDao;
	
	public void test(){
		System.out.println(memberDao);
	}
	
	
	@Override
	public String memberJoin(MemberDTO memberDTO , Model model) {
		// DAO의 회원가입하는 메서드를 호출
		int result =memberDao.join(memberDTO);
		String message="";
		if(result>0){
			message="성공";
		}else{
			message="실패";
		}
		model.addAttribute("message", message);
		return message;
	}

	
	@Override
	public void memberLogin(MemberDTO memberDTO) {
		// DAO의 로그인 하는 메서드 호출

	}

}
