package aaa.controll;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.model.BoardDTO;
import aaa.service.MybatisMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/mybatis")
public class MybatisController {

	@Resource
	MybatisMapper mapper;
	
	@RequestMapping("{ser}")
	@ResponseBody
	Object sqlGO(@PathVariable String ser) {
		System.out.println("ser:"+ser);
		Object res = null;
		
		try {
			//Class cc = mapper.getClass();
			//Method mth = cc.getDeclaredMethod(ser);
			//res = mth.invoke(mapper);
			//System.out.println(cc);
			//System.out.println(mth);
			System.out.println("ser:"+ser);
			res = mapper.getClass().getDeclaredMethod(ser).invoke(mapper);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
		
		return res;
	}
	
	@RequestMapping("listSch")
	@ResponseBody
	Object listSch(BoardDTO dto) {
		System.out.println("listSch");
		Object res = mapper.listSch(dto);
		
		return res;
	}
	
	@RequestMapping("cntSch")
	@ResponseBody
	Object cntSch(BoardDTO dto) {
		System.out.println("cntSch");
		Object res = mapper.cntSch(dto);
		
		return res;
	}
}
