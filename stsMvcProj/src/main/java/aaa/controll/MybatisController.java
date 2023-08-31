package aaa.controll;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import aaa.model.BoardDTO;
import aaa.model.BoardDTOs;
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
		System.out.println("ser:" + ser);
		Object res = null;

		try {
			// Class cc = mapper.getClass();
			// Method mth = cc.getDeclaredMethod(ser);
			// res = mth.invoke(mapper);
			// System.out.println(cc);
			// System.out.println(mth);
			System.out.println("ser:" + ser);
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

	@RequestMapping("insertttList")
	@ResponseBody
	Object insertttList(BoardDTO dto) {
		System.out.println("inserttt");
		ArrayList<BoardDTO> list = new ArrayList<>();
		list.add(new BoardDTO("제목1", "이름1", "1111", "내용1"));
		list.add(new BoardDTO("제목12", "이름16", "1111", "내용156"));
		list.add(new BoardDTO("제목13", "이름17", "1111", "내용1나얼ㄴㅇ"));
		list.add(new BoardDTO("제목14", "이름18", "1111", "내용1sdjfzklf"));
		list.add(new BoardDTO("제목15", "이름19", "1111", "내용1sfkdlzsk"));

		Object res = mapper.insertttList(list);

		return res;
	}
	
	@RequestMapping("insertDTOs")
	@ResponseBody
	Object insertDTOs() {
		System.out.println("insertDTOs");
	

		Object res = mapper.insertDTOs(new BoardDTOs());

		return res;
	}
	
	@RequestMapping("delete")
	@ResponseBody
	Object delete(int id, String pw) {
		System.out.println("delete");
	

		Object res = mapper.delete(id,pw);

		return res;
	}
	
	@RequestMapping("update")
	@ResponseBody
	Object update(int id, String pw, String name, String content, String title) {
		System.out.println("update");
		
		Object res = mapper.update(id,pw,name,content,title);

		return res;
	}
	
	@RequestMapping("insert")
	@ResponseBody
	Object insert(BoardDTO dto) {
		
		System.out.println("insert");
		
		Object res = mapper.inserttt(dto);
		
		res += " , "+dto.getId();

		return res;
	}
}
