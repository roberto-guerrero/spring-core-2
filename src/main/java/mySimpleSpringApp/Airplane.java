package mySimpleSpringApp;

public class Airplane {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String talk() {
		return "I'm an airplane.";
	}
}
