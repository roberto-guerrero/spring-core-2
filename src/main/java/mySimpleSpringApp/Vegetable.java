package mySimpleSpringApp;

import org.springframework.util.StringUtils;

public class Vegetable {
	private String name;
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String talk() {
		String talk = "I'm vegetable";
				
		if (!StringUtils.isEmpty(name)) {
			talk+=" My name is " + name;
		}
		
		return talk;
	}
}
