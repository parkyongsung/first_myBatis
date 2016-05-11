package com.choa.noticeDTO;

import java.util.List;

public interface NoticeDAO {

	public void write(NoticeDTO noticeDTO) throws Exception;
	public List<NoticeDTO> getContents(int startNum, int lastNum)throws Exception;
	public NoticeDTO view(int num)throws Exception;
	public int getTotalist()throws Exception;

	
}
