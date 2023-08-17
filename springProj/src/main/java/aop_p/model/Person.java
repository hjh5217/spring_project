package aop_p.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;


public class Person {
	
	String name;
	
	Menu menu;
	
	public Person(String name, Menu menu) {
		super();
		this.name = name;
		this.menu = menu;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", menu=" + menu + "]";
	}

}
