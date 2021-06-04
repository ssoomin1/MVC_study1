package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		//jsp에서 받는 형식으로 가져오기
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
//			System.out.println(i+1+"번째 c 요소 : "+c[i]);
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
			System.out.println("93년생 생일 : "+value);
		}
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		return "result";
	}
	
	@GetMapping("/test4")
	public String test4() {
		return "test_form";
	}
	
	@PostMapping("/test4")
	public String test4_2(WebRequest request) {
		String id=request.getParameter("uid");
		String pw=request.getParameter("upw");
		System.out.println("사용자 아이디: "+id);
		System.out.println("사용자 비밀번호 : "+pw);
		return "result";
	}
	
	//어디에 담을 것인지 변수는 중괄호로 해주기
	@GetMapping("/test5/{a}/{b}/{c}")
	public String test5(@PathVariable int a,
						@PathVariable int b,
						@PathVariable int c) {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		return "result";
	}
}
