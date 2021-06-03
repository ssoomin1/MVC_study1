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
		return "WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test() {
		return "test"; //view페이지
	}
	
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String test1() {
		return "test1.jsp";
	}
	
	@RequestMapping(value="/test2",method=RequestMethod.GET)
	public String test2() {
		return "/WEB-INF/views/test2";
	}
	
	@RequestMapping(value="sub1/test3",method=RequestMethod.GET)
	public String test3() {
		return "/WEB-INF/views/sub1/test3";
	}
	
	@RequestMapping(value="sub1/test4",method=RequestMethod.GET)
	public String test4() {
		return "/WEB-INF/views/sub1/test4";
	}
	/*
	@RequestMapping(value="/test5",method=RequestMethod.GET)
	public String test5() {
		return "/WEB-INF/views/test5.jsp";
	}*/
	
//	@RequestMapping(value="/sub1/test6",method=RequestMethod.GET)
//	public String test5() {
//		//return "WEB-INF/views/test6.jsp";//상대경로 기준위치 : 현재 나의 위치 sub1/WEB-INF/views/test6.jsp
//		return "/WEB-INF/views/test6.jsp"; //절대경로 기준위치 : 처음부터 (webapp)에서부터 시작 
//	}
//	
	@RequestMapping(value="sub1/test7",method=RequestMethod.GET)
	public String test7() {
		//return "sub1/test7.jsp";//상대경로 jsv가 views폴더 안에 들어가있지. 
		//view(jsp파일)
		//절대경로 최상위 :WEB-INF/views
		//Spring의 최상위 : webapp
		return "/sub1/test7.jsp"; //절대경로 기준위치 : 처음부터 (webapp)에서부터 시작 
	}
	
	
} 
