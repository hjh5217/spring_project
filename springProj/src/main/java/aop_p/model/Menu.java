package aop_p.model;

import org.springframework.stereotype.Component;


public class Menu {
	
	String kind, name;
	int price;
	
	public Menu(String kind, String name, int price) {
		super();
		this.kind = kind;
		this.name = name;
		this.price = price;
	}
	
	public String getKind() {
		return kind;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [kind=" + kind + ", name=" + name + ", price=" + price + "]";
	}
}
