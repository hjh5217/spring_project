package di_p.main;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Menu;

public class menu_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/menu.xml","di_xml/menu_when.xml");
		
		Menu menu = context.getBean("menu",Menu.class);
		
		System.out.println("========메서드=========");
		System.out.println(menu.order_breakfast());
		System.out.println(menu.order_lunch());
		System.out.println(menu.order_dinner());
		System.out.println("=======추상메서드=======");
		System.out.println(menu.order_br());
		System.out.println(menu.order_lun());
		System.out.println(menu.order_din());
		System.out.println("========직접입력========");
		System.out.println("어떤 메뉴를 드릴까요(아침,점심,저녁)");
		Scanner sc = new Scanner(System.in);
		String when = sc.nextLine();
		
		if(when.equals("아침")) {
			System.out.println(menu.order_breakfast());
		}else if(when.equals("점심")) {
			System.out.println(menu.order_lunch());
		}else if(when.equals("저녁")) {
			System.out.println(menu.order_dinner());
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
