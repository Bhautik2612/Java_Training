package student;
import java.util.Scanner;

public class ArrayOfStudent {
	
	public void CreateArrayOfStd() {
	
	Scanner sc =  new Scanner(System.in);
	Student[] std = new Student[10];
	
	for(int i=0;i<2;i++) {
		std[i] = new Student();
	}
	
	for(int k=0;k<2;k++) {
		System.out.println("Enter First Name : ");
		std[k].setFirstName(sc.nextLine());
		System.out.println("Enter First Name : ");
		std[k].setLastName(sc.nextLine());
		System.out.println("Enter Class Year : ");
		std[k].setClassYear(sc.nextLine());
		System.out.println("Enter Class Year : ");
		std[k].setMajor(sc.nextLine());
	}
	
	for(int j=0;j<2;j++) {
		System.out.println(std[j]);
	}
	
	sc.close();
	
	}

}
