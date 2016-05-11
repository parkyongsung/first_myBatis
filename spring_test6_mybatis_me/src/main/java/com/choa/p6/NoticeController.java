package com.choa.p6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.choa.notice.NoticeDAO;
import com.choa.notice.NoticeDTO;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {

	@Autowired
	private NoticeDAO noticedao;
	
	@RequestMapping("/view")
	public String getView(@RequestParam int num, Model model){
	try {
		NoticeDTO ndto =	noticedao.view(num);
		model.addAttribute("ndto", ndto);
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	return "notice/noticeView";
	}
	
	
	
	
	
}
