package aaa.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CampingSite {

	public String name;
	public int ea;
	public String [] period;
	public int [] price;
	
}
