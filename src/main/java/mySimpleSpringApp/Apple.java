package mySimpleSpringApp;

public class Apple extends Fruit {
	private String name;
	private String description = "no set";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String talk() {
		String result = super.talk();
		if (description!=null) result += description;
		
		return result;
	}
}
