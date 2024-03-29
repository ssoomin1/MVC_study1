package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//컨트롤러 밑에 있으니까 bean으로 등록시켜줘야함
//객체 bean으로 등록시켜야함 
//@Componenet 상관없지만
//컨트롤러 역할을 하는 것이구나
@Controller
public class HomeController {
	//앞으로 스프링MVC는 이런 패턴이다. 
//	@RequestMapping(value="/",method=RequestMethod.GET)
//	public String home() {
//		System.out.println("home");
//		return null;
//	}
//	
	//test로 접속했을 때 test 출력
	//loccalhost:8088/MVCPrj/test 이렇게
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "index";
	}

} 
