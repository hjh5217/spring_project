package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;import aop_p.webToon.Figure;
import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class ExecMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/exec.xml");
		
		JoSuk jsk = context.getBean("joSuk",JoSuk.class);
		KangBada kbd = context.getBean("kbd",KangBada.class);
		KangSan kangSan = context.getBean("kangSan",KangSan.class);
		Figure figure = context.getBean("figure", Figure.class);
		
		//System.out.println("jsk.dog1:"+jsk.dog1(12,"아기상어"));
		//System.out.println("---------------");
		//System.out.println("jsk.wife:"+jsk.wife());
		//System.out.println("---------------");
		//System.out.println("jsk.papa:"+jsk.papa(44));
		//System.out.println("---------------");
		//kbd.dogdo();
		//System.out.println("---------------");
		//kangSan.yunFish();
		//System.out.println("---------------");
		//kangSan.ra9yo();
		figure.rectangle(11, 10);
		System.out.println("---------------");
		figure.triangle(16, 10, 13);
		System.out.println("---------------");
		figure.circle(5);
		/*
		 * 도형 클래스를 구현하세요
		 * PI = Math.PI
		 * r = 반지름
		 * 			넓이			둘레
		 * 원		파이알제곱		2*r*pi
		 * 직사각형	가로세로		가로+세로 곱2
		 * 직각삼각형	가로세로/2		가로+세로+빗변
		 * 
		 * aop를 이용하여 계산 할 때마다 각 도형의 넓이,둘레의 합계, 평균을 계산하세요
		 * */
	}

}
