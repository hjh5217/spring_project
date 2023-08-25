package aaa.controll;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.model.JoinData;
import aaa.model.StudData;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/form")
public class ValidController {

	@RequestMapping("validation")
	String validForm(JoinData jd) {
		
		return "form/validForm";
	}
	
	@RequestMapping("validReg")
	String validReg(@Valid JoinData jd, BindingResult br) {
		System.out.println("validReg : "+br.hasErrors());
		
		if(br.hasErrors()) {
			return "form/validForm";
		}
		if(jd.getPid().equals("aaa") || jd.getPid().equals("bbb") || jd.getPid().equals("ccc")
				|| jd.getPid().equals("ddd") || jd.getPid().equals("fff")) {
			br.rejectValue("pid", null,"중복이야");
			return "form/validForm";
		}
		
		if(!jd.getPw1().equals(jd.getPw2())) { //암호가 일치하지 않으면
			br.rejectValue("pw2", null, "암호확인이 문제여");
			return "form/validForm";
		}
		
		
		// 성적을 입력받아 처리하세요
		// 이름 - 한글만 2~5
		// 국영수 - 숫자 0~100
		
		//에러가 없으면
		return "form/validReg";
	}
	
	@RequestMapping("studform")
	String studForm(StudData sd) {
		
		return "form/studForm";
	}
	@RequestMapping("studReg")
	String studReg(@Valid StudData sd , BindingResult br) {
		if(br.hasErrors()) {
			return "form/studForm";
		}
		return "form/StudReg";
	}
}
