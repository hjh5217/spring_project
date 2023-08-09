package di_p.main;

import java.util.Arrays;

public class StuColl {

	String name;
	int [] jum;
	int tot,avg,rank;
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}

	public void rankCalc(StuColl [] exArr) {
		rank = 1;
		for(StuColl you : exArr) {
			if(avg < you.avg) {
				rank++;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getJum() {
		return jum;
	}

	public void setJum(int... jum) {
		this.jum = jum;
		calc();
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "StuColl [name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + ", rank="
				+ rank + "]";
	}
}
