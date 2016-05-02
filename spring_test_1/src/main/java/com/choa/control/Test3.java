package com.choa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test3 {
//test3.to
//Test3 controller 
//views/to/test3.jsp
	@RequestMapping(value="test3.to")
	public String test3(){
	
		return "to/test3";
	}
	
	
	
}
