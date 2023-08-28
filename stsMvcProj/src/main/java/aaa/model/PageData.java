package aaa.model;

import aaa.service.BoardMapper;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import lombok.Data;


@Data
public class PageData {
	
	@Resource
	BoardMapper mapper;
	
	String msg, goUrl;
	
	public int limit = 3;
	public int pageLimit = 4;
	//int start = 0;
	public int page, start, pageStart, pageEnd, total, pageTotal;
			
	public PageData(HttpServletRequest request) {
		page = 1;
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page"));
		}
	}
	
	public void calc() {
		
		this.total = 0;
		
		pageTotal = total/limit;
		
		if((total%limit)>0) {
			pageTotal++;
		}
		
		start = (page-1)*limit;
		pageStart = (page-1)/pageLimit*pageLimit+1;
		pageEnd = pageStart + pageLimit-1;
		
		if(pageEnd > pageTotal) {
			pageEnd = pageTotal;
		}
		
		System.out.println(pageTotal+" ,"+pageEnd);
	}			
}
