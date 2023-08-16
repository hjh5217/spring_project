package aop_p.adv;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class FigureAdvice {

	final double PI = Math.PI;
	double area = 0;
	double perimeter = 0;
	
	void calc(JoinPoint joinPoint) {
		if(joinPoint.getArgs().length==2) {
			int width = (int) joinPoint.getArgs()[0];
			int height = (int) joinPoint.getArgs()[1];
			area = width*height;
			perimeter = (width+height)*2;
			System.out.println("사각형입니다.");
			System.out.println("넓이: "+area +", 둘레: "+perimeter);
		}
		else if(joinPoint.getArgs().length==3) {
			int width = (int) joinPoint.getArgs()[0];
			int height = (int) joinPoint.getArgs()[1];
			int hypotenuse = (int) joinPoint.getArgs()[2];
			area = (width*height)/2;
			perimeter = width+height+hypotenuse;
			System.out.println("삼각형입니다.");
			System.out.println("넓이: "+area +", 둘레: "+perimeter);
		}
		else if(joinPoint.getArgs().length==1) {
			double radius = (double) joinPoint.getArgs()[0];
			area = radius*radius*PI;
			perimeter = radius*PI*2;
			System.out.println("원입니다.");
			System.out.println("넓이: "+area +", 둘레: "+perimeter);
		}
	}
}