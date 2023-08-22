package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("login")
public class LoginController {

	@RequestMapping("main")
	String login(
			Model mm,
			HttpServletResponse response,
			@CookieValue(value="pid", defaultValue = "")String pid,
			@CookieValue(value="pw", defaultValue = "")String pw
			) {
		if(pid!="" && pw!="") {
			mm.addAttribute("id",pid);
			mm.addAttribute("pw",pw);
		}
		return "login/main";
	}
	
	@RequestMapping("loginReg")
	String loginReg(
			HttpServletResponse response,
			String pid,
			String pw
			) {
		Cookie coo = new Cookie("pid", pid);
		response.addCookie(coo);
		System.out.println(coo.getValue());
		coo = new Cookie("pw", pw);
		response.addCookie(coo);
		System.out.println(coo.getValue());
		return "redirect:main";
	}
	
	@RequestMapping("logOut")
	String logOut(HttpServletResponse response) {
		Cookie coo = new Cookie("pid","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		System.out.println(coo.getValue());
		coo = new Cookie("pw","");
		coo.setMaxAge(0);
		response.addCookie(coo);
		System.out.println(coo.getValue());
		return "redirect:main";
	}
	
	@RequestMapping("error")
	String error(HttpServletResponse response) {
		
		return "redirect:main";
	}
}
