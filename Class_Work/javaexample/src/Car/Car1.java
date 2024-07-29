package Car;

public class Car1 {
	
	private String CarType;
	private int CarID;
	private float Rent;
	
	private void setRent(String carType) {
        switch (carType) {
            case "SUV":
                Rent = 2500;
                break;
            case "VAN":
                Rent = 1000;
                break;
            case "SMALL CAR":
                Rent = 500;
                break;
            default:
                System.out.println("Data not exist");
                Rent = 0;
                break;
        }
    }
	
	public String getCarType() {
		return CarType;
	}
	
	public void setCarType(String carType) {
		
		CarType = carType;
        setRent(carType);
	}
	
	public int getCarID() {
		return CarID;
	}
	
	public void setCarID(int carID) {
		CarID = carID;
	}
	
	public float getRent() {
		return Rent;
	}
	
	public void setRent(float rent) {
		Rent = rent;
	}
}
