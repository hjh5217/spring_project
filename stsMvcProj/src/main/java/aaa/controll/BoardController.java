package aaa.controll;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import aaa.model.BoardDTO;
import aaa.model.PageData;
import aaa.service.BoardMapper;
import jakarta.annotation.Resource;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Resource
	BoardMapper mapper;

	@RequestMapping("list")
	String list(Model mm, PageData pd) {
		pd.calc(mapper.totalCnt());
		System.out.println(pd);
		List<BoardDTO> data = mapper.list(pd);
		mm.addAttribute("pd", pd);
		mm.addAttribute("mainData", data);
		return "board/list";
	}

	@RequestMapping("detail/{id}")
	String detail(Model mm, @PathVariable int id, @RequestParam("page") int page) {
		mapper.addcnt(id);
		//System.out.println(mapper.detail(id).getUpfile());
		String upFile = mapper.detail(id).getUpfile();
		if(upFile == null || upFile.equals("")) {
			mm.addAttribute("fileName", mapper.detail(id).getUpfile());
		}
		System.out.println("detail아 페이지 있니? : "+page);
		mm.addAttribute("dto", mapper.detail(id));
		mm.addAttribute("page",page);
		return "board/detail";
	}

	@GetMapping("insert")
	String insert(BoardDTO dto, @RequestParam("page") int page, Model mm) {
		System.out.println("insert야 페이지 있니? : "+page);
		mm.addAttribute("page", page);
		return "board/insertForm";
	}

	@PostMapping("insert")
	String insertReg(BoardDTO dto, PageData pd, Model mm) {
		// System.out.println(dto);
		// System.out.println(dto.getMmff().getOriginalFilename());
		// 서버에 파일 저장
		fileSave(dto.getMmff());
		// 파일이름 db에 저장
		dto.setUpfile(dto.getMmff().getOriginalFilename());
		System.out.println(mapper.getMaxId());
		dto.setGid(mapper.getMaxId()+1);
		System.out.println(dto);
		mapper.insert(dto);

		pd.setMsg("등록되었습니다.");
		pd.setGoUrl("list");

		return "board/alert";
	}
	
	@GetMapping("reply")
	String reply(BoardDTO dto, Model mm, @RequestParam("page") int page, @RequestParam("gid") int gid, @RequestParam("id") int id ) {
		System.out.println("reply야 페이지 있니? : "+page);
		mm.addAttribute("page", page);
		mm.addAttribute("gid", gid);
		mm.addAttribute("id", id);
		return "board/replyForm";
	}

	@GetMapping("delete/{id}")
	String delete(BoardDTO dto, @PathVariable int id, @RequestParam("page") int page, Model mm) {
		// System.out.println(id);
		dto.setId(id);
		System.out.println("delete야 페이지 있니? : "+page);
		mm.addAttribute("page",page);
		return "board/deleteForm";
	}

	@PostMapping("delete/{id}")
	String deleteReg(BoardDTO dto, PageData pd, Model mm) {
		pd.setMsg("삭제실패");
		pd.setGoUrl("/board/delete/" + dto.getId());
		int cnt = mapper.delete(dto);
		System.out.println("deleteReg:" + cnt);

		if (cnt > 0) {
			pd.setMsg("삭제성공");
			pd.setGoUrl("/board/list");
		}

		return "board/alert";
	}

	@GetMapping("modify/{id}")
	String delete(Model mm, @PathVariable int id, @RequestParam("page") int page) {
		System.out.println("modify야 페이지 있니? : "+page);
		mm.addAttribute("dto", mapper.detail(id));
		mm.addAttribute("page",page);
		return "board/modifyForm";
	}

	@PostMapping("modify/{id}")
	String modifyReg(BoardDTO dto, PageData pd, Model mm) {

		pd.setMsg("수정실패");
		pd.setGoUrl("/board/modify/" + dto.getId());

		int cnt = mapper.update(dto);
		System.out.println("modifyReg:" + cnt);

		if (cnt > 0) {
			pd.setMsg("수정되었습니다");
			pd.setGoUrl("/board/detail/" + dto.getId());
		}

		return "board/alert";
	}

	void fileSave(MultipartFile mf) {
		String path = "C:\\green_project\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";
		
		File ff = new File(path+"\\"+mf.getOriginalFilename());
		
		try {
			FileOutputStream fos = new FileOutputStream(ff);
			
			fos.write(mf.getBytes());
			
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
