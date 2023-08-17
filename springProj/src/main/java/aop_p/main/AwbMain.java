package aop_p.main;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.BanAvg;
import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class AwbMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/awb.xml");
		
		JoSuk jsk = context.getBean("joSuk",JoSuk.class);
		KangBada kbd = context.getBean("kbd",KangBada.class);
		KangSan kangSan = context.getBean("kangSan",KangSan.class);
		BanAvg ban = context.getBean("banAvg",BanAvg.class);
		System.out.println("jsk.dog1:"+jsk.dog1(12,"아기상어"));
		System.out.println("---------------");
		System.out.println("jsk.wife:"+jsk.wife());
		System.out.println("---------------");
		System.out.println("jsk.papa:"+jsk.papa(44));
		System.out.println("---------------");
		kbd.dogdo();
		System.out.println("---------------");
		kangSan.yunFish();
		System.out.println("---------------");
		kangSan.ra9yo();
		System.out.println("---------------");
		Random r = new Random();
		
		ArrayList<Integer> korL = new ArrayList<>();
		ArrayList<Integer> engL = new ArrayList<>();
		int [] kor = new int[10];
		int [] eng = new int[10];
		for(int i=0; i<kor.length; i++) {
			int a = r.nextInt(40,100);
			int b = r.nextInt(40,100);
			korL.add(a);
			engL.add(b);
		}
		ban.ban(korL, engL);
		System.out.println("---------------");
		ban.normalBan(15, 90, 70, 85);
		System.out.println("---------------");
		ban.exBan(20, 60, 50, 70, 100);
		
		/*
		 * 학생 성적을 계산하세요
		 * 과목 2 : 뭐라고하는반
		 * 과목 3 : 일반
		 * 과목 4 : 예체능
		 * 
		 * aop를 이용하여 학생분류별 인원수와 평균합계, 평균의 평균을 구하세요
		 * */
	
		
	}

}