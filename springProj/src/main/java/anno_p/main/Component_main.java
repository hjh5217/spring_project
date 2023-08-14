package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Component_main {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/component.xml");
		
		System.out.println(context.getBean("mouse"));
		
		//첫글자 대소문자 구분안함
		System.out.println(context.getBean("noteBook"));
		
		System.out.println(context.getBean("bbcc"));
		
		//요런경우는 제대로 이름으로 불러줘야함
		System.out.println(context.getBean("DESKTop"));
		
		context.close();
	}

}
