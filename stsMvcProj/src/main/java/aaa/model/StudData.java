package aaa.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class StudData {

	// 성적을 입력받아 처리하세요
	// 이름 - 한글만 2~5
	// 국영수 - 숫자 0~100
	@Pattern(regexp="[가-힣]{2,5}",message = "한글2~5자맞춰라팍씨")
	String name;
	@Positive(message="양수입력")
	@Min(0) @Max(100)
	int kor;
	@Positive(message="양수입력")
	@Min(0) @Max(100)
	int eng;
	@Positive(message="양수입력")
	@Min(0) @Max(100)
	int mat;
	
}
