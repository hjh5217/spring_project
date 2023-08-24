package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import aaa.model.MenuData;
import aaa.model.SeasonMain;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/model")
public class ModelSeasonController {
	
	@Resource
	SeasonMain sm;
	
	@ModelAttribute("hNav")
	Object headerNav() {
		ArrayList<MenuData> res = new ArrayList<>();
		res.add(new MenuData("spring","봄"));
		res.add(new MenuData("summer","여름"));
		res.add(new MenuData("fall","가을"));
		res.add(new MenuData("winter","겨울"));
		
		return res;
	}
	
	//@ModelAttribute("mainCt")
	//Object mainContent(@RequestParam(value = "sn", defaultValue="spring") String sn) {
	//	System.out.println(sn);
	//	return sm.getPicture(sn);
	//}
	
	@ModelAttribute("fTxt")
	Object footerTxt() {
		return "바닥글";
	}
	
	@RequestMapping("season")
	String template(Model mm) {
		mm.addAttribute("mainCt",sm.getPicture("spring"));
		return "model/template";
	}
	
	@RequestMapping("season/{sn}")
	String template(Model mm, @PathVariable String sn) {
		//mm.addAttribute("headerUrl","header1");
		mm.addAttribute("mainCt",sm.getPicture(sn));
		return "model/template";
	}
	
}
