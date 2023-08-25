package aaa.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Resource;
import lombok.Data;

@Data
public class ReservationPerson {

	String name = "한주훈";
	String pw = "1234";
	String tel = "010-1234-5678";
	String sitename = "";
	
	public List<CampingSite> getSites(){
		List<CampingSite> res = new ArrayList<>();
		
		res.add(new CampingSite("1-1", 4, new String[]{"1박 2일","2박 3일"}, new int[]{20000,40000}));
		res.add(new CampingSite("2-1", 4, new String[]{"1박 2일","2박 3일"}, new int[]{30000,60000}));
		res.add(new CampingSite("3-1", 4, new String[]{"1박 2일","2박 3일"}, new int[]{40000,80000}));
		
		return res; 
	}
	
}
