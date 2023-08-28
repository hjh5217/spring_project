package aaa.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Alias("bDTO")
@Data
public class BoardDTO {
	
	int id,cnt,seq,lev,gid;
	String title,pname,pw,upfile,content;
	Date reg_date;
	
	MultipartFile mmff;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) HH:mm");
	

	//내용 공백 다음줄처리
	public String getContentBr() {
		return content.replaceAll("\n", "<br/>");
	}
	//날짜 yyyy-MM-dd (E) HH:mm 로 변경
	public String getReg_dateStr() {
		return sdf.format(reg_date);
	}
	
}
