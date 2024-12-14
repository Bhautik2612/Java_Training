package classreleationexample;

public class TestPerson {

	public static void main(String[] args) {
		
		Addresss add = new Addresss();
		
		add.setFlatno("B-504");
		add.setSocietyname("Applewood Sorrel");
		add.setArea("Bopal");
		add.setPincode(395010);
		
		Person p1 = new Person();
		
		p1.setPname("Bhautik");
		p1.setPemail("abc@gmail.com");
		p1.setAdd(add);
		
		System.out.println(p1);
	}

}
