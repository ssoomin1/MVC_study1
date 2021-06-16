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
	
	//�ڵ����� setter �޼ҵ� ȣ���ؼ� �� ���� ����. 
	//������ ���� �� => ModelDTO dto = new ModelDTO�� ������ش�.
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
		//String���� return�����ʴ´�. return ���� ModelAndView��
		mv.addObject("id","kim");
		mv.addObject("pw","111111");
		mv.setViewName("test5");
		return mv;
	}
	
	@GetMapping("/test6")
	public String test6(@ModelAttribute DataDTO dto) {
		//���������� new�������� ��ü�� ��������鼭, setter�� ���� �ڵ�����
		//��ü�̸��� �������������� �ڵ������� dataDTO�� �ȴ�. (Model����)
		//��ü�̸� �������ְ� ���� ���� ModelAttribute("test") DataDTO dto �̷������� �ϸ� �ȴ� 
		return "test6";
	}
	
	
}
