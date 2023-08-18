package aaa.model;

import lombok.Data;

@Data
public class Person2 {
	
	String id,pw,pname, gender;

	public Person2(String id, String pw, String pname, String gender) {
		super();
		this.id = id;
		this.pw = pw;
		this.pname = pname;
		this.gender = gender;
	}

}
