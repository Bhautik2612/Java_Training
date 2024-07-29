package constructorexample;

public class Address {
	
	private String SocityName,Area;
	private int Pincode;
	
//	Defult Constructor
	public Address() {
		this.Area = "Shela";
	}
	
//	Parameterized Constructor
	public Address(String socityName, String area, int pincode) {
		this.SocityName = socityName;
		this.Area = area;
		this.Pincode = pincode;
	}

	public String getSocityName() {
		return SocityName;
	}

	public void setSocityName(String socityName) {
		SocityName = socityName;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public int getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [SocityName=" + SocityName + ", Area=" + Area + ", Pincode=" + Pincode + "]";
	}
	
	
	
	
}
