package Car;

public class CarMain {

	public static void main(String[] args) {
		
		Car1 car = new Car1();
	 
			car.setCarType("SUV");
	        System.out.println("Car Type: " + car.getCarType());
	        System.out.println("Rent: " + car.getRent());

	        car.setCarType("VAN");
	        System.out.println("Car Type: " + car.getCarType());
	        System.out.println("Rent: " + car.getRent());

	        car.setCarType("SMALL CAR");
	        System.out.println("Car Type: " + car.getCarType());
	        System.out.println("Rent: " + car.getRent());
		
	}

}
