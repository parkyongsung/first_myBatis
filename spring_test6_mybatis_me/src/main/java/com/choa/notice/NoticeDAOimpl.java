package com.choa.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAOimpl implements NoticeDAO {

	@Autowired
	private SqlSession sqlSession;
	//final= 상수로 쓰겟다. 굳이 final 쓸 이유는 없음..
	private static final String nameSpace="NoticeMapper";
	
	@Override
	public void write(NoticeDTO noticeDTO) throws Exception {
	}

	@Override
	public List<NoticeDTO> getContents(int startNum, int lastNum) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NoticeDTO view(int num) throws Exception {
		
		NoticeDTO ndto = sqlSession.selectOne(nameSpace+".view", num);
		
		return ndto;
	}

	@Override
	public int getTotalist() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
