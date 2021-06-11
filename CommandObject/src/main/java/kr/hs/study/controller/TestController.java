package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.ModelDTO;
import kr.hs.study.dto.ModelDTO2;

@Controller
public class TestController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/test1")
	public String test1() {
		return "result";
	}
	
	@GetMapping("/test2")
	public String test2() {
		return "test_form";
	}
	
	@PostMapping("/test2")
	public String test2_2(@ModelAttribute ModelDTO dto) {
		//자동으로 ModelDTO 를 객체가 만들어진다(ModelDTO dto = new ModelDTO())
		System.out.println("data1: "+dto.getData1());
		System.out.println("data2: "+dto.getData2());
		return "result";
	}
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute ModelDTO2 dto2) {
		System.out.println("data1: "+dto2.getData1());
		System.out.println("data2: "+dto2.getData2());
		return "result";
	}
}
