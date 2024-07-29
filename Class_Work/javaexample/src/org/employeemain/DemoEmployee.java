package org.employeemain;

import org.employeemanagement.*;

public class DemoEmployee {

	public static void main(String[] args) {
		
		Designation deg = new Designation();
		Employee emp = new Employee();
		
		deg.setDesig("Devloper");
		deg.setDesc("Java");
		emp.seteName("Heli");
		emp.setDegi(deg.getDesig());
		
		System.out.println(emp);
		
	}

}
