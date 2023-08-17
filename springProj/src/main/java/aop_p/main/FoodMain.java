package aop_p.main;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.model.Menu;
import aop_p.model.Person;
import aop_p.webToon.EasyMenu;
import aop_p.webToon.Figure;
import aop_p.webToon.JoSuk;
import aop_p.webToon.KangBada;
import aop_p.webToon.KangSan;

public class FoodMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("aop_xml/food.xml");
		
		EasyMenu em = context.getBean("easyMenu",EasyMenu.class);
		
		ArrayList<Menu> menu = new ArrayList<>();
		
		menu.add(new Menu("찌개","김치찌개",9000));
		menu.add(new Menu("찌개","차돌된장찌개",12000));
		menu.add(new Menu("찌개","순두부찌개",11000));
		menu.add(new Menu("덮밥","제육덮밥",9000));
		menu.add(new Menu("덮밥","소불고기덮밥",12000));
		menu.add(new Menu("덮밥","오삼불고기덮밥",10000));
		menu.add(new Menu("덮밥","버섯덮밥",13000));
		menu.add(new Menu("덮밥","오므라이스",8000));
		menu.add(new Menu("찌개","부대찌개",15000));
		menu.add(new Menu("찌개","참치김치찌개",10000));
		menu.add(new Menu("찌개","애호박찌개",11000));
		menu.add(new Menu("찌개","청국장",12000));
		
		em.menu(menu);
	}

}