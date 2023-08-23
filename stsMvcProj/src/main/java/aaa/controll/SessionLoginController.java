package aaa.controll;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.model.Person;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("session")
public class SessionLoginController {

	@RequestMapping("main")
	String login(Model mm, HttpSession session) {
		
		return "session/LoginMain";
	}
	
	@RequestMapping("loginReg")
	String loginReg(
			HttpServletResponse response,
			HttpSession session,
			String pid,
			String pw,
			Model mm
			) {
		
		HashMap<String, Person> map = new HashMap<>();
		map.put("aaa", new Person("aaa","한가인","1111"));
		map.put("bbb", new Person("bbb","두가인","2222"));
		map.put("ccc", new Person("ccc","삼가인","3333"));
		map.put("ddd", new Person("ddd","사가인","4444"));
		map.put("fff", new Person("eee","오가인","5555"));
		String msg = "로그인 실패";
		if(map.containsKey(pid) && map.get(pid).getPw().equals(pw)) {
			session.setAttribute("person", map.get(pid));
			System.out.println(session.getAttribute("person"));
			msg=map.get(pid).getPname() + "님 로그인 하셨습니다.";
			mm.addAttribute("msg",msg);
		}
		else {
			mm.addAttribute("msg",msg);
		}
		
		return "session/loginAlert";
	}
	
	@RequestMapping("logout")
	String logOut(HttpServletResponse response,HttpSession session,Model mm) {
		Person p = (Person)session.getAttribute("person");
		mm.addAttribute("msg",p.getPname()+"님 로그아웃");
		session.invalidate();
		return "session/loginAlert";
	}

}
