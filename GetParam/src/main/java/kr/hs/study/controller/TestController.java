package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		//jsp���� �޴� �������� ��������
		String a=request.getParameter("a");
		String b= request.getParameter("b");
		String c=request.getParameter("c");
		System.out.println(a+"\t"+b+"\t"+c);
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		//a
		String a=request.getParameter("a");
		//b
		String b= request.getParameter("b");
		//c
		String[]c=request.getParameterValues("c");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
//		for(int i=0;i<c.length;i++) {
//			System.out.println(i+1+"��° c ��� : "+c[i]);
//		}
		
		for(String value:c) {
			System.out.println("c: "+value);
		}
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(WebRequest request) {
		String a=request.getParameter("a");
		String [] b= request.getParameterValues("b");
		String c=request.getParameter("c");
		String d=request.getParameter("d");
		
		System.out.println("a: "+a);
		for(String value:b) {
			System.out.println("93��� ���� : "+value);
		}
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4(WebRequest request) {
		return "test_form.jsp";
	}
}
