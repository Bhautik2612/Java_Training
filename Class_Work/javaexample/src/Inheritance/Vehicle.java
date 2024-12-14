package Inheritance;

public class Vehicle {
	
	private String comp;
	
	public Vehicle () {
		this.comp = "Dummy";
	}
	
	

	@Override
	public String toString() {
		return "Vehicle [comp=" + comp + "]";
	}

public Vehicle(String comp) {

	this.comp = comp;
}
	
}
