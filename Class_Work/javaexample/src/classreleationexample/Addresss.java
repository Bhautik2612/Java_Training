package classreleationexample;

public class Addresss {
	
	private String flatno,societyname,area;
	private int pincode;
	public String getFlatno() {
		return flatno;
	}
	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
	public String getSocietyname() {
		return societyname;
	}
	public void setSocietyname(String societyname) {
		this.societyname = societyname;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "Addresss [flatno=" + flatno + ", societyname=" + societyname + ", area=" + area + ", pincode=" + pincode
				+ "]";
	}
	
	
}
