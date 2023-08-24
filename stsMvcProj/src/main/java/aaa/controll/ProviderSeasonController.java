package aaa.controll;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.MenuData;
import aaa.service.SeasonProvider;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/provider/season/{sn}")
public class ProviderSeasonController {

	@Resource
	SeasonProvider provider;
	
	@ModelAttribute("hNav")
	Object headerNav() {
		ArrayList<MenuData>res = new ArrayList<>();
		res.add(new MenuData("spring", "봄"));
		res.add(new MenuData("summer", "여름"));
		res.add(new MenuData("fall", "가을"));
		res.add(new MenuData("winter", "겨울"));
		return res;
	}
	
	@ModelAttribute("mainCt")
	Object mainContent(@PathVariable String sn) {
		return provider.getContext().getBean(sn);
	}
	
	
	@ModelAttribute("fTxt")
	Object footerTxt() {
		return "바닥글입니다.";
	}
	

	@RequestMapping
	String template() {
		return "provider/template";
	}
}
