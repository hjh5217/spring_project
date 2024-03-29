package anno_p;

import jakarta.annotation.Resource;

public class RCCar {

	String name;
	
	@Resource
	Motor mtr;
	
	//@Resource(required=false) required안됨
	@Resource(name="ww2")
	RCWheel rw1;
	RCWheel rw2, rw3, rw4;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RCCar [name=" + name + ", mtr=" + mtr + ", rw1=" + rw1 + ", rw2=" + rw2 + ", rw3=" + rw3 + ", rw4="
				+ rw4 + "]";
	}
	
}

class RCWheel{
	String name;
	int size;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public String toString() {
		return "RCWheel [name=" + name + ", size=" + size + "]";
	}
}
