package aop_p.webToon;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class BanAvg {

	public void ban(ArrayList<Integer> kor,ArrayList<Integer> eng) {
		//System.out.println("사람수: "+people + ", 국어평균: "+kor+", 영어평균: "+eng);
	}
	public void normalBan(int people,int kor,int eng, int mat) {
		System.out.println("사람수: "+people + ", 국어평균: "+kor+", 영어평균: "+eng+", 수학평균: "+mat);
	}
	public void exBan(int people,int kor,int eng, int mat, int etc) {
		System.out.println("사람수: "+people + ", 국어평균: "+kor+", 영어평균: "+eng+", 수학평균: "+mat+ ", 기타평균:"+etc);
	}
}