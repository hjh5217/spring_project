package anno_p;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WashMachine {
	@Autowired
	@Qualifier("mmm2")
	Motor mt;
	Drum dr;
	String name;

	// 있으면 결합 없어도 ㄱㅊ
	@Autowired(required = false)
	public void setDr(Drum dr) {
		this.dr = dr;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "WashMachine [mt=" + mt + ", dr=" + dr + ", name=" + name + "]";
	}

}

class Motor{
	String name;
	int power;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "Motor [name=" + name + ", power=" + power + "]";
	}
	
}

class Drum{
	String name;
	int size;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Drum [name=" + name + ", size=" + size + "]";
	}
	
}