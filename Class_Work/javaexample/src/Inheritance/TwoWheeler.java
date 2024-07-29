package Inheritance;

public class TwoWheeler extends Vehicle {
	
	private String fluid_type;

	public TwoWheeler () {
		super();
		this.fluid_type = "Petrol";
	}
	
	public TwoWheeler(String fluid_type,String cm) {
		super(cm);
		this.fluid_type = fluid_type;
	}

	@Override
	public String toString() {
		return fluid_type  + super.toString();
	}


}
