package aaa.model;

import java.util.HashMap;
import lombok.Data;

@Data
public class Ban {

	HashMap<Integer, StudentTest> ban1;
	HashMap<Integer, StudentTest> ban2;
	HashMap<Integer, StudentTest> ban3;
	
	public Ban() {
		ban1 = new HashMap<>();
		ban2 = new HashMap<>();
		ban3 = new HashMap<>();
		ban1.put(1, new StudentTest("한주훈",new int[] {33,44,55}));
		ban1.put(2, new StudentTest("둘주훈",new int[] {44,55,66}));
		ban1.put(3, new StudentTest("삼주훈",new int[] {55,66,77}));
		ban1.put(4, new StudentTest("넷주훈",new int[] {66,77,88}));
		ban1.put(5, new StudentTest("오주훈",new int[] {77,88,99}));
		
		ban2.put(1, new StudentTest("정우성",new int[] {33,44,55}));
		ban2.put(2, new StudentTest("정좌성",new int[] {44,55,66}));
		ban2.put(3, new StudentTest("정위성",new int[] {55,66,77}));
		ban2.put(4, new StudentTest("정아래성",new int[] {66,77,88}));
		ban2.put(5, new StudentTest("북두칠성",new int[] {77,88,99}));
		
		ban3.put(1, new StudentTest("한가인",new int[] {33,44,55}));
		ban3.put(2, new StudentTest("둘가인",new int[] {44,55,66}));
		ban3.put(3, new StudentTest("삼가인",new int[] {55,66,77}));
		ban3.put(4, new StudentTest("넷가인",new int[] {66,77,88}));
		ban3.put(5, new StudentTest("오가인",new int[] {77,88,99}));
	}

	
}
