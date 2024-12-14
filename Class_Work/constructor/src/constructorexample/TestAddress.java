package constructorexample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestAddress {

	public static void main(String[] args) {
		
//		Address ad = new Address("AppleWood", "Shela", 383910);
		
		Address ad2 = new Address();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Socity Name :");
		String sname,area;
		
		try {
			sname = br.readLine();
			ad2.setSocityName(sname);
			area = br.readLine();
			ad2.setArea(area);
			
//			int pin = Integer.parseInt(br.readLine());
			System.out.println(ad2);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
//		Address ad2 = new Address("Karad", "Surat", 395010);				
//		System.out.println(ad2);
	}

}
