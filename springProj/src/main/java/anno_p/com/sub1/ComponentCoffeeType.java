package anno_p.com.sub1;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import anno_p.com.CoffeeInterface;
import jakarta.annotation.Resource;

@Component
public class ComponentCoffeeType implements CoffeeInterface{

	@Resource(name="americano")
	Americano ame;
	@Resource(name="caffeLatte")
	CaffeLatte latte;
	@Resource(name="caramelMacciatto")
	CaramelMacciatto caramel;
	
	@Override
	public String toString() {
		return "ComponentCoffeeType [ame=" + ame + ", latte=" + latte + ", caramel=" + caramel + "]";
	}

	@Override
	public void makeCoffee() {
		System.out.println("커피를 만듭니다");
		
	}

	@Override
	public void drinkCoffee() {
		System.out.println("커피를 마십니다");
		
	}

}

@Component
class Americano {
	
	String beanName = "콜롬비아 수프리모";
	String water = "아리수";
	int price = 1400;

	@Override
	public String toString() {
		return "Americano [beanName=" + beanName + ", water=" + water + ", price=" + price + "]";
	}
	
}

@Component
class CaffeLatte extends Americano{

	int price = 2000;
	String milk = "서울우유";
	
	@Override
	public String toString() {
		return "CaffeLatte [beanName=" + beanName + ", water=" + water + ", price=" + price + ", milk=" + milk + "]";
	}
	
}

@Component
class CaramelMacciatto extends Americano{

	int price = 3000;
	String caramel = "카라멜소스";
	
	@Override
	public String toString() {
		return "CaramelMacciatto [beanName=" + beanName + ", water=" + water + ", price=" + price + ", caramel="
				+ caramel + "]";
	}
	
}