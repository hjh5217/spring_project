package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("event")
public class EventController {

	
	@RequestMapping("gogo")
	@ResponseBody
	String gogo() {
		System.out.println("gogo()실행");
		return "gogo 페이지";
	}
	
	@RequestMapping("fail")
	@ResponseBody
	String failll() {
		return "failll 페이지";
	}
}
