package anno_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentCoffee_main {

	public static void main(String[] args) {
	

		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/componentcoffee.xml");

		System.out.println(context.getBean("americano"));
		System.out.println(context.getBean("caffeLatte"));
		System.out.println(context.getBean("caramelMacciatto"));
		System.out.println(context.getBean("componentCoffeeType"));

		context.close();
		
	}

}
