package arrayafemployee;

import java.util.Scanner;
import javaexample.Employee;

public class ArrayOfEmployee {
	
	public void CreateArrayOfEmp() {
		
		Scanner sc =  new Scanner(System.in);
		Employee[] emp = new Employee[10];
		
		for(int i=0;i<3;i++) {
			emp[i] = new Employee();
		}
		
		for(int k=0;k<3;k++) {
			System.out.println("Enter name : ");
			emp[k].setName(sc.nextLine());
			System.out.println("Enter Designation : ");
			emp[k].setDesignation(sc.nextLine());
		}
		
		for(int j=0;j<3;j++) {
			System.out.println(emp[j]);
		}
		sc.close();
	}
}
