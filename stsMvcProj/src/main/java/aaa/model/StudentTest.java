package aaa.model;

import java.util.ArrayList;
import java.util.Arrays;

import lombok.Data;

@Data
public class StudentTest {

	String name;
	int [] jum;
	int tot,avg,rank;
	
	public StudentTest(String name, int[] jum) {
		super();
		this.name = name;
		this.jum = jum;
		getTot();
		getAvg();
	}
	
	
	public int getTot() {
		for(int j : jum) {
			tot+=j;
		}
		return tot;
	}

	public int getAvg() {
		avg = tot/jum.length;
		return avg;
	}

	public void rankCalc(ArrayList<StudentTest> arr) {
		rank = 1;
		for (StudentTest you : arr) {
			if(avg < you.avg) {
				rank++;
			}
		}
	}


	@Override
	public String toString() {
		return "StudentTest [name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg;
	}
	
}
