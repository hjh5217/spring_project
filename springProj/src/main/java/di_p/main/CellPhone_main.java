package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CellPhone_main {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/cellphone.xml");

		System.out.println(context.getBean("AdultPhone"));
		System.out.println(context.getBean("GalaxyPhone"));
	}

}
