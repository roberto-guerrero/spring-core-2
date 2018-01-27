package mySimpleSpringApp;

import org.springframework.util.StringUtils;

public class Grain {
	private String name;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String talk() {
		String talk = "I'm a grain.";
		
		if (!StringUtils.isEmpty(name)) {
			talk+=" Name: "+name;
		}
		
		return "I'm grain.";
	}
}
