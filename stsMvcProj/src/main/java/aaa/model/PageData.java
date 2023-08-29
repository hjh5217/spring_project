package aaa.model;

import lombok.Data;

@Data
public class PageData {
	
	String msg, goUrl;
	
	public int page = 1;
	public int limit = 10;
	public int pageLimit = 5;
	public int start, pageStart, pageEnd, total, pageTotal;


	public void calc(int total) {
		this.total = total;
		
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
		
		System.out.println("pageTotal:" + pageTotal+" , pageEnd:" + pageEnd);
	}			
}
