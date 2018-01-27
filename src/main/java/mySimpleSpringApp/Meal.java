package mySimpleSpringApp;

public class Meal {
	private Fruit fruit;
	private Vegetable vegetable;
	private Dairy dairy;
	private Meat meat;
	private Grain grain;
	
	public Meal() {
		
	}
	
	public Meal(Fruit f, Vegetable v, Dairy d, Meat m, Grain g) {
		this.fruit = f;
		this.vegetable = v;
		this.dairy = d;
		this.meat = m;
		this.grain = g;
	}
	
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Vegetable getVegetable() {
		return vegetable;
	}
	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
	}
	public Dairy getDairy() {
		return dairy;
	}
	public void setDairy(Dairy dairy) {
		this.dairy = dairy;
	}
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public Grain getGrain() {
		return grain;
	}
	public void setGrain(Grain grain) {
		this.grain = grain;
	}
	
	public String whatIsInThisMeal() {
		String answer = "This meal contains: ";
		
		if (fruit!=null) answer+=fruit.talk() + "\n";
		if (vegetable!=null) answer+=vegetable.talk() + "\n";
		if (dairy!=null) answer+=dairy.talk() + "\n";
		if (meat!=null) answer+=meat.talk() + "\n";
		if (grain!=null) answer+=grain.talk() + "\n";
		
		return answer;
	}
}

