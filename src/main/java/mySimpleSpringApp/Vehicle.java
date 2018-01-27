package mySimpleSpringApp;

public class Vehicle {
	private Car car;
	private Motorcycle motorcycle;
	private Airplane airplane;
	
	public Vehicle() {
		
	}
	
	public Vehicle(Car c, Motorcycle m, Airplane a) {
		this.car = c;
		this.motorcycle = m;
		this.airplane = a;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Motorcycle getMotorcycle() {
		return motorcycle;
	}
	public void setMotorcycle(Motorcycle motorcycle) {
		this.motorcycle = motorcycle;
	}
	public Airplane getAirplane() {
		return airplane;
	}
	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	
	public String whatVehicle() {
		String answer = "Vehicles: \n";
		
		if (car != null) answer+=car.talk() + "\n";
		if (motorcycle != null) answer+=motorcycle.talk() + "\n";
		if (airplane != null) answer+=airplane.talk() + "\n";
		
		return answer;
	}
}

