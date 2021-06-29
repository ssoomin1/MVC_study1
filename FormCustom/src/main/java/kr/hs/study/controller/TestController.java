package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import kr.hs.study.model.dto.LoginDTO;

@Controller
public class TestController {
	@GetMapping("/test1")
	public String test1(LoginDTO dto) {
		dto.setUser_name("kim");
		dto.setUser_id("kim_id");
		dto.setUser_pw("1111");
		dto.setUser_postcode("1234");
		dto.setUser_addr1("seoul");
		dto.setUser_addr2("23 road");
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(LoginDTO dto) {
		dto.setUser_name("lee");
		dto.setUser_id("lee_id");
		dto.setUser_pw("2222");
		dto.setUser_postcode("0614");
		dto.setUser_addr1("seoul");
		dto.setUser_addr2("516 road");
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(@ModelAttribute("user") LoginDTO dto) {
		dto.setUser_name("park");
		dto.setUser_id("park_id");
		dto.setUser_pw("3333");
		dto.setUser_postcode("1234");
		dto.setUser_addr1("seoul");
		dto.setUser_addr2("23 road");
		
		return "test3";
	}
}
