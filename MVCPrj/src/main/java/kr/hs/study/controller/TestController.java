package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping(value="/test5",method=RequestMethod.GET)
	public String test5() {
		return "WEB-INF/views/test5.jsp";
	}
}
