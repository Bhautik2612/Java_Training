package day2_myclass_Q1;

public class MyClass {
	
	 private static int count = 0;
	   private int x;

	   public MyClass(int i)
	   {
	      x = i;
	   }
	   public static void incrementCount()
	   {
	      count++;      
	   }

	   public void printX()
	   {
	      System.out.println("Value of x : "  + x);
	   }

	   public static void printCount()
	   {
	      System.out.println("Value of count : "  + count);
	   }
	public void setX(int x) {
		this.x = x;
	}
	

}
