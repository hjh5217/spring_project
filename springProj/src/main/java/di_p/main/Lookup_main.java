package di_p.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.Coffee;
import di_p.CoffeeShop;

public class Lookup_main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/lookup.xml");

		
		CoffeeShop cs = context.getBean("cs",CoffeeShop.class);
		cs.order_void();
		System.out.println("order_am :" + cs.order_am());
		
		//private 접근불가
		//System.out.println("order_private:"+cs.order_private());
		System.out.println("order_private:"+cs.order_private2());
		
		//private,final,static -> lookup-method 적용되지 않고 클래스에 정의된 메소드가 호출됨
		System.out.println("order_final:"+cs.order_final());
		
		System.out.println("order_static :"+cs.order_static());
		
		System.out.println("order_piano: "+cs.order_piano());
		
		//구현체가 없어서 에러지만 lookup-method 가 적용되면 실행됨
		System.out.println("order_hunter: "+cs.order_hunter());
		//추상메서드를 정의하지 않고 실행하면 에러발생
		//System.out.println("order_hunter: "+cs.order_latte());
		
		//리턴형이 다른 메소드는 lookup-method 불가
		//System.out.println("order_tea :" + cs.order_tea());
		
		//void 는 리턴 불가
		//System.out.println("order_void"+cs.order_void());
		
		/*
		 * Coffee co = context.getBean("co",Coffee.class);
		 * 
		 * System.out.println("co :" + co);
		 */
		
		
		
	}

}
