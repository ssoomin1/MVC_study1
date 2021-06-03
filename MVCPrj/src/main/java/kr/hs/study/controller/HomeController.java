package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//��Ʈ�ѷ� �ؿ� �����ϱ� bean���� ��Ͻ��������
//��ü bean���� ��Ͻ��Ѿ��� 
//@Componenet ���������
//��Ʈ�ѷ� ������ �ϴ� ���̱���
@Controller
public class HomeController {
	//������ ������MVC�� �̷� �����̴�. 
//	@RequestMapping(value="/",method=RequestMethod.GET)
//	public String home() {
//		System.out.println("home");
//		return null;
//	}
//	
	//test�� �������� �� test ���
	//loccalhost:8088/MVCPrj/test �̷���
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test() {
		return "test"; //view������
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
//		//return "WEB-INF/views/test6.jsp";//����� ������ġ : ���� ���� ��ġ sub1/WEB-INF/views/test6.jsp
//		return "/WEB-INF/views/test6.jsp"; //������ ������ġ : ó������ (webapp)�������� ���� 
//	}
//	
	@RequestMapping(value="sub1/test7",method=RequestMethod.GET)
	public String test7() {
		//return "sub1/test7.jsp";//����� jsv�� views���� �ȿ� ������. 
		//view(jsp����)
		//������ �ֻ��� :WEB-INF/views
		//Spring�� �ֻ��� : webapp
		return "/sub1/test7.jsp"; //������ ������ġ : ó������ (webapp)�������� ���� 
	}
	
	
} 