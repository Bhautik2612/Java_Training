package classreleationexample;

public class Person {
	
	private String Pname,Pemail;
	private Addresss add;
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPemail() {
		return Pemail;
	}
	public void setPemail(String pemail) {
		Pemail = pemail;
	}
	public Addresss getAdd() {
		return add;
	}
	public void setAdd(Addresss add) {
		this.add = add;
	}
	
	@Override
	public String toString() {
		return "Person [Pname=" + Pname + ", Pemail=" + Pemail + ", add=" + add + "]";
	}
}
