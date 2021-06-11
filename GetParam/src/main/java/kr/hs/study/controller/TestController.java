package kr.hs.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import kr.hs.study.model.dto.ModelDTO;

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
	public String test4() {
		return "test_form";
	}
	
	@PostMapping("/test4")
	public String test4_2(WebRequest request) {
		String id=request.getParameter("uid");
		String pw=request.getParameter("upw");
		System.out.println("����� ���̵�: "+id);
		System.out.println("����� ��й�ȣ : "+pw);
		return "result";
	}
	
	//��� ���� ������ ������ �߰�ȣ�� ���ֱ�
	@GetMapping("/test5/{a}/{b}/{c}")
	public String test5(@PathVariable int a,
						@PathVariable int b,
						@PathVariable int c) {
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		return "result";
	}
	
	@GetMapping("/test6")
	public String test6(@RequestParam (value="a") int aa, @RequestParam int b, @RequestParam int c[]) {
		//RequestParam�� ����ȯ�� �����ϴ�. ���� �ִ� �͵��� StringŸ������ �޾Ҵµ� ���� int�� �޾Ҵ�. 
		//�������� �Ȱ��� �ִ°������� �ٸ��� �ְ� �ʹٸ�
		//value�� �� �ֳ�? ���� ������
		System.out.println("a: "+aa);
		System.out.println("b: "+b);
		for(int num:c){
			System.out.println(num);
		}
		
		return "result";
	}
//	
	
//	@GetMapping("/test7")
//	public String test7(@RequestParam MAp(String,STring),expm) {
//		
	
//	}
	
//	@Getmapping("/test8")
//	public String test8(@RequestParam = Map<Sttrin,String>) {
//		String a=map.get("a)'";-;
//		String b=map.get("b");
//		for(String val:c
//	}
	
	@GetMapping("/test9")
	//public String test9(@ModelAttribute ModelDTO dto) {
	public String test9(ModelDTO dto) {
		//a,b,c�� ��½�Ű��
		System.out.println(dto.getA());
		System.out.println(dto.getB());
		System.out.println(dto.getC());
		return "result";
	}
	
	
}
