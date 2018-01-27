package mySimpleSpringApp;

public class Car {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String talk() {
		return "I'm a car.";
	}
}
