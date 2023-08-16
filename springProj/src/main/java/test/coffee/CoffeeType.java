package test.coffee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class CoffeeType {
	
	@Bean
	TAmericano ame() {
		return new TAmericano("커피콩","백산수",1500);
	}
	@Bean
	TCaffelatte tlatte() {
		return new TCaffelatte("커피커피콩","아리수","스울우유",2300);
	}
	@Bean
	TCaramelmacciatto tcaramel() {
		return new TCaramelmacciatto("코피콩","삼다수","상하우유","오뚜기카라멜소스",3500);
	}
	
}

@Component
class TAmericano{
	String beans;
	String water;
	int price;
	
	public TAmericano() {
		// TODO Auto-generated constructor stub
	}
	
	public TAmericano(String beans, String water, int price) {
		super();
		this.beans = beans;
		this.water = water;
		this.price = price;
	}
	@Override
	public String toString() {
		return "TAmericano [beans=" + beans + ", water=" + water + ", price=" + price + "]";
	}
	
}
@Component
class TCaffelatte{
	String beans;
	String water;
	String milk;
	int price;
	
	public TCaffelatte() {
		// TODO Auto-generated constructor stub
	}
	
	public TCaffelatte(String beans, String water, String milk, int price) {
		super();
		this.beans = beans;
		this.water = water;
		this.milk = milk;
		this.price = price;
	}

	@Override
	public String toString() {
		return "TCaffelatte [beans=" + beans + ", water=" + water + ", milk=" + milk + ", price=" + price + "]";
	}
	
	
}
@Component
class TCaramelmacciatto{
	String beans;
	String water;
	String milk;
	String caramel;
	int price;
	
	public TCaramelmacciatto() {
		// TODO Auto-generated constructor stub
	}
	
	public TCaramelmacciatto(String beans, String water, String milk, String caramel, int price) {
		super();
		this.beans = beans;
		this.water = water;
		this.milk = milk;
		this.caramel = caramel;
		this.price = price;
	}

	@Override
	public String toString() {
		return "TCaramelmacciatto [beans=" + beans + ", water=" + water + ", milk=" + milk + ", caramel=" + caramel
				+ ", price=" + price + "]";
	}
	
	
}