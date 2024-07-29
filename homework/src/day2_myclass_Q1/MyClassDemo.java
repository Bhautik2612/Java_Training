package day2_myclass_Q1;

public class MyClassDemo {

	public static void main(String[] args) {
		
		 MyClass myObject1 = new MyClass(5);
	     MyClass myObject2 = new MyClass(7); 
	     
	     myObject1.printX();
	     MyClass.incrementCount();
	     MyClass.incrementCount();
	     MyClass.printCount();
	     MyClass.printCount();
	     myObject2.printX();
 	     myObject1.setX(14);
	     MyClass.incrementCount();
	     myObject1.printX();
	     MyClass.printCount();
	     MyClass.printCount();
	}

}
