package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.model.ClassMain;
import aaa.model.MenuData;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/class")
public class ClassController {
	
	@Resource
	ClassMain cm;
	
	@ModelAttribute("cNav")
	Object headerNav() {
		ArrayList<MenuData> res = new ArrayList<>();
		res.add(new MenuData("1반","1반"));
		res.add(new MenuData("2반","2반"));
		res.add(new MenuData("3반","3반"));
		//System.out.println(res);
		return res;
	}
	
	@ModelAttribute("mainCt")
	Object mainContent(@RequestParam(value = "ban", defaultValue="1반") String ban) {
		//System.out.println(ban);
		return cm.getBan(ban);
	}
	
	@ModelAttribute("fTxt")
	Object footerTxt() {
		return "바닥글";
	}
	
	@RequestMapping("main")
	String template() {
		return "class/template";
	}
	
}
