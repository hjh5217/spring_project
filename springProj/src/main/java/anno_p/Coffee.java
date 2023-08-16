package anno_p;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Coffee {

	String name;
	int price;
	CoffeeBean beans;
	Topping topping;

	@Override
	public String toString() {
		price = beans.price+topping.price;
		return "Coffee [name=" + name + ", price=" + price + ", beans=" + beans + ", topping=" + topping + "]";
	}

	@Autowired(required = true)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	@Autowired(required = true)
	public void setBeans(CoffeeBean beans) {
		this.beans = beans;
	}
	@Autowired
	public void setTopping(Topping topping) {
		this.topping = topping;
	}	
}


class CoffeeBean{
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CoffeeBean [name=" + name + ", price=" + price + "]";
	}
}


class Topping{
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Topping [name=" + name + ", price=" + price + "]";
	}
}