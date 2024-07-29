package org.employeemanagement;

public class Employee {
	private String ename,desig;

	public String geteName() {
		return ename;
	}

	public void seteName(String eName) {
		this.ename = eName;
	}

	public String getDegi() {
		return desig;
	}

	public void setDegi(String desig) {
		this.desig = desig;
	}

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", desig=" + desig + "]";
	}
	

}
