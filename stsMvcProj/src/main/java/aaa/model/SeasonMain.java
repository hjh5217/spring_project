package aaa.model;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class SeasonMain {
	
	HashMap<String, String[]> data;
	
	public SeasonMain() {
		data = new HashMap<>();
		
		data.put("spring","sp1.png,sp2.png,sp3.png".split(","));
		data.put("summer","sua.png,sub.png".split(","));
		data.put("fall","fa_1.png,fa_2.png,fa_5.png,fa_6.png".split(","));
		data.put("winter","ww.png,ee.png".split(","));
	}
	
	public String [] getPicture(String title) {
		return data.get(title);
	}
}
