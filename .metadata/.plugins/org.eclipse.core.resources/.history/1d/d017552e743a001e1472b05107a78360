package test.coffee;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoffeeType_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("anno_xml/newcoffee.xml");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("무슨 커피로 드릴까요");
		String input = sc.next();
		System.out.println(context.getBean(input));
		/*ame tlatte tcaramel
		 * System.out.println(context.getBean("tlatte"));
		 * System.out.println(context.getBean("tcaramel"));
		 */
		
		context.close();

	}

}
