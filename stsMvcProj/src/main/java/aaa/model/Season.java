package aaa.model;

import lombok.Data;

@Data
public class Season {

	String name;
	String [] picture;
	
	public Season(String name,String[] picture) {
		super();
		this.name = name;
		this.picture = picture;
	}

}
