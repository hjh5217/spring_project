package aop_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.webToon.Figure;
import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class AdviceMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/anno.xml");
		
		
		JoSuk jsk = context.getBean("joSuk",JoSuk.class);
		
		
		System.out.println("jsk.dog1:"+jsk.dog1(12,"아기상어"));
		jsk.nums(2);
		jsk.nums(0);
	}

}
