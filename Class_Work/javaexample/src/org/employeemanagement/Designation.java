package org.employeemanagement;

public class Designation {
	
	private String Desig,Desc;

	public String getDesig() {
		return Desig;
	}

	public void setDesig(String desig) {
		Desig = desig;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	@Override
	public String toString() {
		return "Designation [Desig=" + Desig + ", Desc=" + Desc + "]";
	}
	
	

}
