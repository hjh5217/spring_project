package aaa.model;

import java.util.ArrayList;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("dtos")
public class BoardDTOs {

	ArrayList<BoardDTO> arr = new ArrayList<>();
	int no = 3;
	String ct = "이것이 내용이다.";
	
	public BoardDTOs() {
		arr = new ArrayList<>();
		arr.add(new BoardDTO("dtos제목1","dtos이름1","1111","dtos내용1"));
		arr.add(new BoardDTO("dtos제목2","dtos이름2","1111","dtos내용2"));
		arr.add(new BoardDTO("dtos제목3","dtos이름3","1111","dtos내용3"));
		arr.add(new BoardDTO("dtos제목4","dtos이름4","1111","dtos내용4"));
		
	}
}
