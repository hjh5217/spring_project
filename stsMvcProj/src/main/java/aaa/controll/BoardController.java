package aaa.controll;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLEncoder;
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
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
	String detail(Model mm, @PathVariable int id, PageData pd) {
		mapper.addcnt(id);
		// System.out.println(mapper.detail(id).getUpfile());
		String upFile = mapper.detail(id).getUpfile();
		if (upFile == null || upFile.equals("")) {
			mm.addAttribute("fileName", mapper.detail(id).getUpfile());
		}
		System.out.println("detail아 페이지 있니? : " + pd.page);
		mm.addAttribute("dto", mapper.detail(id));
		mm.addAttribute("page", pd.page);
		return "board/detail";
	}

	@GetMapping("insert")
	String insert(BoardDTO dto, PageData pd, Model mm) {
		System.out.println("insert야 페이지 있니? : " + pd.page);
		mm.addAttribute("page", pd.page);
		return "board/insertForm";
	}

	@PostMapping("insert")
	String insertReg(BoardDTO dto, PageData pd, Model mm, HttpServletRequest request) {
		// System.out.println(dto);
		// System.out.println(dto.getMmff().getOriginalFilename());
		// 서버에 파일 저장
		// fileSave(dto, request);
		// 파일이름 db에 저장
		System.out.println(mapper.getMaxId());
		dto.setGid(mapper.getMaxId() + 1);
		// System.out.println(dto);
		mapper.insert(dto);

		pd.setMsg("등록되었습니다.");
		pd.setGoUrl("list?page=" + pd.page);

		return "board/alert";
	}

	@GetMapping("reply")
	String reply(BoardDTO dto, Model mm, PageData pd, @RequestParam("id") int id) {
		System.out.println("reply야 페이지 있니? : " + pd.page);
		mm.addAttribute("page", pd.page);
		mm.addAttribute("id", id);
		return "board/replyForm";
	}

	@GetMapping("delete/{id}")
	String delete(BoardDTO dto, @PathVariable int id, PageData pd, Model mm) {
		// System.out.println(id);
		dto.setId(id);
		System.out.println("delete야 페이지 있니? : " + pd.page);
		mm.addAttribute("page", pd.page);
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
	String delete(Model mm, @PathVariable int id, PageData pd) {
		System.out.println("modify야 페이지 있니? : " + pd.page);
		mm.addAttribute("dto", mapper.detail(id));
		mm.addAttribute("page", pd.page);
		return "board/modifyForm";
	}

	@PostMapping("modify/{id}")
	String modifyReg(BoardDTO dto, PageData pd, Model mm, HttpServletRequest request) {

		pd.setMsg("수정실패");
		pd.setGoUrl("/board/modify/" + dto.getId() + "?page=" + pd.page);

		int cnt = mapper.idPwChk(dto);
		
		System.out.println("modifyReg:"+cnt);
		if(cnt>0) {
			if(dto.getUpfile()==null) {
				fileSave(dto,request);
			}
			mapper.update(dto);
			pd.setMsg("수정되었습니다");
			pd.setGoUrl("/board/detail/" + dto.getId() + "?page=" + pd.page);
		}
		mm.addAttribute("dto", dto);
		return "board/alert";
	}

	@PostMapping("fileDelete")
	String BFileDelete(BoardDTO dto, PageData pd, Model mm) {

		pd.setMsg("파일삭제 실패");
		pd.setGoUrl("/board/modify/" + dto.getId() + "?page=" + pd.page);

		int cnt = mapper.idPwChk(dto);
		System.out.println("BFileDelete:" + cnt);

		if (cnt > 0) {
			pd.setMsg("삭제되었습니다");
			pd.setGoUrl("/board/modify/" + dto.getId() + "?page=" + pd.page);
		}
		mm.addAttribute("dto", dto);
		return "board/alert";
	}

	void fileSave(BoardDTO dto, HttpServletRequest request) {

		// 파일 업로드 유무 확인
		if (dto.getMmff().isEmpty()) {

			return;
		}

		String path = request.getServletContext().getRealPath("up");
		path = "C:\\green_project\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";

		int dot = dto.getMmff().getOriginalFilename().lastIndexOf(".");
		String fDomain = dto.getMmff().getOriginalFilename().substring(0, dot);
		String ext = dto.getMmff().getOriginalFilename().substring(dot);

		dto.setUpfile(fDomain + ext);
		File ff = new File(path + "\\" + dto.getUpfile());
		int cnt = 1;
		while (ff.exists()) {

			dto.setUpfile(fDomain + "_" + cnt + ext);
			ff = new File(path + "\\" + dto.getUpfile());
			cnt++;
		}

		try {
			FileOutputStream fos = new FileOutputStream(ff);

			fos.write(dto.getMmff().getBytes());

			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@GetMapping("download/{ff}")
	void download(@PathVariable String ff, HttpServletRequest request, HttpServletResponse response) {

		String path = request.getServletContext().getRealPath("up");
		path = "C:\\green_project\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";

		try {
			FileInputStream fis = new FileInputStream(path + "\\" + ff);
			String encFName = URLEncoder.encode(ff, "utf-8");
			System.out.println(ff + "->" + encFName);
			response.setHeader("Content-Disposition", "attachment;filename=" + encFName);

			ServletOutputStream sos = response.getOutputStream();

			byte[] buf = new byte[1024];

			// int cnt = 0;
			while (fis.available() > 0) { // 읽을 내용이 남아 있다면
				int len = fis.read(buf); // 읽어서 -> buf 에 넣음
											// len : 넣은 byte 길이

				sos.write(buf, 0, len); // 보낸다 : buf의 0부터 len 만큼

				// cnt ++;
				// System.out.println(cnt+":"+len);
			}

			sos.close();
			fis.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void fileDeleteModule(BoardDTO delDTO, HttpServletRequest request) {
		if (delDTO.getUpfile() != null) {
			String path = request.getServletContext().getRealPath("up");
			path = "C:\\green_project\\spring_work\\stsMvcProj\\src\\main\\webapp\\up";

			new File(path + "\\" + delDTO.getUpfile()).delete();
		}
	}
}
