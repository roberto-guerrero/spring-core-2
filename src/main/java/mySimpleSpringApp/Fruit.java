package mySimpleSpringApp;

import org.springframework.util.StringUtils;

public class Fruit {
	private String name;
	
	public Fruit() {
		
	}
	
	public Fruit(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String talk() {
		String talk = "I'm a fruit.";
		
		if (!StringUtils.isEmpty(name)) {
			talk+=" My name is " + name;
		}
		
		return talk;
	}
}
