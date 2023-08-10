package di_p;

public class Coffee {
	String name;
	int price;

	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
