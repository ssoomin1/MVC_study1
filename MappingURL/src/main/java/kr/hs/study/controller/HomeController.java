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
		return "index";
	}

} 