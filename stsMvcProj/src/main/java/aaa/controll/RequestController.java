package aaa.controll;

import java.util.Arrays;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import aaa.model.Person;
import aaa.model.Person2;
import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("request")
public class RequestController {

	@RequestMapping("attr1")
	ModelAndView attr1() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("req/attr");
		mav.addObject("age",29);
		mav.addObject("pname","정우성");
		mav.addObject("jum",new int[] {78,89,34});
		mav.addObject("now",new Date());
		mav.addObject("per",new Person("장동건","남",true));
		return mav;
	}
	
	@RequestMapping("attr2")
	String attr2(HttpServletRequest request) {
		request.setAttribute("age",22);
		request.setAttribute("pname","정좌성");
		request.setAttribute("jum",new int[] {75,82,31,11,23});
		request.setAttribute("now",new Date());
		request.setAttribute("per",new Person("장서건","여",true));
		return "req/attr";
	}
	
	@RequestMapping("attr3")
	String attr3(Model mm) {
		mm.addAttribute("age",13);
		mm.addAttribute("pname","정북성");
		mm.addAttribute("jum",new int[] {75,82});
		mm.addAttribute("now",new Date());
		mm.addAttribute("per",new Person("북두신건","IT",true));
		return "req/attr";
	}
	@RequestMapping("attr4")
	String attr4(Model mm, 
			@ModelAttribute("age") int age,
			@ModelAttribute("nick") String nick,
			@ModelAttribute("jum") int [] jum) {
		System.out.println("age: "+age+" nick: "+nick +" jum: "+Arrays.toString(jum));
		
		mm.addAttribute("now",new Date());
		mm.addAttribute("per",new Person("북두신건","IT",true));
		return "req/attr";
	}
	
	@RequestMapping("attrForm")
	String attrForm() {
		return "req/attrForm";
	}
	
	
	@RequestMapping("attrReg")
	String attrReg( 
			@ModelAttribute("age") int age,
			@ModelAttribute("pname") String pname,
			int [] jum,
			String gender,
			boolean mil,
			Person per) {
		
		System.out.println("age:"+age);
		System.out.println("pname:"+pname);
		System.out.println("jum:"+Arrays.toString(jum));
		System.out.println("gender:"+gender);
		System.out.println("mil:"+mil);
		System.out.println("per:"+per);
		return "req/attrReg";
	}
	@RequestMapping("loginForm")
	String loginForm() {
		return "req/loginForm";
	}
	
	@RequestMapping("loginCheck")
	String login(
			@ModelAttribute("id") String id,
			@ModelAttribute("pw") String pw,
			@ModelAttribute("pname") String pname,
			@ModelAttribute("gender") String gender,
			Person2 per2) {
		
		return "req/loginCheck";
	}
}
