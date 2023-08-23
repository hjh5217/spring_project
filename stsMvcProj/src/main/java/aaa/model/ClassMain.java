package aaa.model;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class ClassMain {
	
	HashMap<String, HashMap<Integer, StudentTest>> banData;
	Ban ban;
	
	public ClassMain() {
		ban = new Ban();
		banData = new HashMap<>();
		banData.put("1반", ban.getBan1());
		banData.put("2반", ban.getBan2());
		banData.put("3반", ban.getBan3());
	}

	public HashMap<Integer, StudentTest> getBan(String ban) {

		return banData.get(ban);
	}
}
