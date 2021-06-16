package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.hs.study.dto.DataDTO;
import kr.hs.study.dto.ModelDTO;

@Controller
public class TestController {
//	@GetMapping("/test2")
//	public String test2() {
//		return "test2";
//	}
	
	@GetMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("id","kim");
		model.addAttribute("pw", "1111");
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3() {
		return "loginForm";
	}
	
	//자동으로 setter 메소드 호출해서 싹 값이 들어간다. 
	//저렇게 선언 후 => ModelDTO dto = new ModelDTO로 만들어준다.
	@PostMapping("/test3")
	public String test3(@ModelAttribute ModelDTO dto,Model model) {
		model.addAttribute("uid",dto.getUid());
		model.addAttribute("upw",dto.getUpw());
		return "test3";
	}
	
	@GetMapping("/test4")
	public String test4(Model model) {
		model.addAttribute("a","100");
		model.addAttribute("b","200");
		return "test4";
	}
	
	@GetMapping("/test5")
	public ModelAndView test5(ModelAndView mv) {
		//String으로 return하지않는다. return 값이 ModelAndView임
		mv.addObject("id","kim");
		mv.addObject("pw","111111");
		mv.setViewName("test5");
		return mv;
	}
	
	@GetMapping("/test6")
	public String test6(@ModelAttribute DataDTO dto) {
		//내부적으로 new연산으로 객체가 만들어지면서, setter로 값이 자동주입
		//객체이름을 정해주지않으면 자동적으로 dataDTO가 된다. (Model없이)
		//객체이름 지정해주고 싶을 때는 ModelAttribute("test") DataDTO dto 이런식으로 하면 된다 
		return "test6";
	}
	
	
}
