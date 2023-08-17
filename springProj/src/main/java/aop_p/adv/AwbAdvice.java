package aop_p.adv;

import java.util.ArrayList;
import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AwbAdvice {

	void js(JoinPoint joinPoint) {
		System.out.println("js:"+joinPoint.getSignature().toShortString());
	}
	
	void kkbbdd(JoinPoint joinPoint) {
		System.out.println("kkbbdd:"+joinPoint.getSignature().toShortString());
	}
	
	void qw(JoinPoint joinPoint,int qq, String ww ) {
		System.out.println("qw(int,String):"+joinPoint.getSignature().toShortString()+"=>"+qq+" "+ww);
	}
	
	void zx(JoinPoint joinPoint,int zz, int xx) {
		System.out.println("zx(int,int):"+joinPoint.getSignature().toShortString());
	}
	void cccc(JoinPoint joinPoint,int cc) {
		System.out.println("cccc(int):"+joinPoint.getSignature().toShortString());
	}
	
	
	void ban(JoinPoint joinPoint, ArrayList<Integer> kor, ArrayList<Integer> eng) {
		int sumk = 0;
		int sume = 0;
		
		for(int i=0; i<kor.size(); i++) {
			sumk += kor.get(i);
			sume += eng.get(i);
		}
		sumk = sumk/kor.size();
		sume = sume/eng.size();

		System.out.println("인원수: "+kor.size()+", 평균합계: "+(sumk+sume));
		System.out.println("평균의 평균: "+((sumk+sume)/2));
	}
	
	void normalBan(JoinPoint joinPoint, int people, int kor,int eng,int mat) {
		System.out.println("인원수: "+people+", 평균합계: "+(kor+eng+mat));
		System.out.println("평균의 평균: "+((kor+eng+mat)/3));
	}
	void exBan(JoinPoint joinPoint, int people, int kor, int eng, int mat, int etc) {
		System.out.println("인원수: "+people+", 평균합계: "+(kor+eng+mat+etc));
		System.out.println("평균의 평균: "+((kor+eng+mat+etc)/4));
	}
	
	
}