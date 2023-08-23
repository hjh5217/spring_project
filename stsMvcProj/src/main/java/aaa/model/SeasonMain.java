package aaa.model;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
public class SeasonMain {
	
	HashMap<String, String[]> data;
	
	public SeasonMain() {
		data = new HashMap<>();
		
		data.put("spring","sp1.jpg,sp2.jpg,sp3.jpg".split(","));
		data.put("summer","sua.png,sub.png".split(","));
		data.put("fall","fa_1.jpg,fa_2.jpg,fa_5.jpg,fa_6.jpg".split(","));
		data.put("winter","ww.jpg,ee.jpg,sp1.jpg".split(","));
	}
	
	public String [] getPicture(String title) {
		return data.get(title);
	}
}
