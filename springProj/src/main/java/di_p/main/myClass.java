package di_p.main;

import java.util.Arrays;

public class myClass {
	
	StuColl [] mc;
	StuColl stu0;
	StuColl stu1;
	StuColl stu2;
	StuColl stu3;
	StuColl stu4;

	@Override
	public String toString() {
		return "myClass [stu0=" + stu0 + ", stu1=" + stu1 + ", stu2=" + stu2 + ", stu3=" + stu3 + ", stu4=" + stu4
				+ "]";
	}

	public StuColl getStu0() {
		return stu0;
	}

	public void setStu0(StuColl stu0) {
		this.stu0 = stu0;
	}

	public StuColl getStu1() {
		return stu1;
	}

	public void setStu1(StuColl stu1) {
		this.stu1 = stu1;
	}

	public StuColl getStu2() {
		return stu2;
	}

	public void setStu2(StuColl stu2) {
		this.stu2 = stu2;
	}

	public StuColl getStu3() {
		return stu3;
	}

	public void setStu3(StuColl stu3) {
		this.stu3 = stu3;
	}

	public StuColl getStu4() {
		return stu4;
	}

	public void setStu4(StuColl stu4) {
		this.stu4 = stu4;
	}
	public void rankCalc() {
		int rank = 1;
		
		for(int i = 0; i<5; i++) {
			for(int j = 0; j<i; j++) {
				if (stu0.avg < stu1.avg) {
					rank++;
				}
			}
		}
		
	}
}
