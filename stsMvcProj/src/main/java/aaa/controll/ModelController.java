package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.Battery;
import aaa.model.Camera;
import aaa.model.Person;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/model")
public class ModelController {
	//이름은 person
	//ppp1과 ppp2중 나중 설정된것이 무엇인지 알 수 없음
	//이렇게 설계하지 말것
	@ModelAttribute
	Person ppp1() {
		return new Person("yzc", "유진초이", "1111");
	}
	@ModelAttribute
	Person ppp2() {
		return new Person("bss", "백승수단장", "2222");
	}
	@ModelAttribute("per3")
	Person ppp3(int no) {
		Person [] res = {
				new Person("gdm", "구동매", "3333"),
				new Person("khs", "김하성", "444"),
				new Person("gas", "고애신", "5555")
		};
		
		System.out.println("ppp3: " + no);
		return res[no];
	}
	
	
	
	@Resource
	Camera cam;

	@Resource
	Battery bat1;
	
	@ModelAttribute
	Camera cc1() {
		return cam;
	}
	
	@ModelAttribute // battery가 이름
	Battery bb1() {
		return bat1;
	}
	
	@RequestMapping("mmm1")
	String mmm1(Model mm) {
		mm.addAttribute("pp","아이젠 소스케");
		return "model/mmm1";
	}
	@RequestMapping("mmm2")
	String mmm2(Model mm) {
		mm.addAttribute("pp2","내가 곧 하늘이다");
		return "model/mmm2";
	}
}
