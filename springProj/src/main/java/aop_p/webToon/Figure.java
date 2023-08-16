package aop_p.webToon;

import org.springframework.stereotype.Component;

@Component
public class Figure {

	public void rectangle(int width,int height) {
		System.out.println("가로: "+width+", 세로: "+height+" 의 사각형입니다.");
	}
	public void triangle(int width,int height,int hypotenuse) {
		System.out.println("가로: "+width+", 세로: "+height+", 빗변:"+hypotenuse+" 의 삼각형입니다.");
	}
	public void circle(double r) {
		System.out.println("반지름: "+r+" 의 원 입니다.");
	}
}
