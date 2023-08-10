package di_p;

abstract public class Menu {

	public Breakfast order_breakfast() {
		return new Breakfast("아침");
	}
	public Lunch order_lunch() {
		return new Lunch("점심");
	}
	public Dinner order_dinner() {
		return new Dinner("저녁");
	}
	
	abstract public Breakfast order_br();
	abstract public Lunch order_lun();
	abstract public Dinner order_din();
}

class Breakfast{
	String name;

	public Breakfast(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "아침메뉴 " + name + " 나왔습니다";
	}

}

class Lunch{
	String name;

	public Lunch(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "점심메뉴 " + name + " 나왔습니다";
	}
}

class Dinner{
	String name;

	public Dinner(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "저녁메뉴 " + name + " 나왔습니다";
	}
	
}