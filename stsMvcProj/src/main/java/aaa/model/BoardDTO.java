package aaa.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
import lombok.NoArgsConstructor;

@Alias("bDTO")
@Data
public class BoardDTO {

	int id, cnt, seq, lev, gid;
	String title, pname, pw, upfile, content;
	Date reg_date;
	// gid 는 소속 , seq 는 댓글 단계 , lev 는 댓글 앞에 칸 추가

	String grade;
	
	MultipartFile mmff;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) HH:mm");


	BoardDTO(){
		
	}
	
	// 내용 공백 다음줄처리
	public String getContentBr() {
		return content.replaceAll("\n", "<br/>");
	}

	// 날짜 yyyy-MM-dd (E) HH:mm 로 변경
	public String getReg_dateStr() {
		return sdf.format(reg_date);
	}

	public BoardDTO(String title, String pname, String pw, String content) {
		super();
		this.title = title;
		this.pname = pname;
		this.pw = pw;
		this.content = content;
	}

}
