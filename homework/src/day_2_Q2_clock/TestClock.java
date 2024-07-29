package day_2_Q2_clock;

import java.util.Scanner;

public class TestClock {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Clock defaultClock = new Clock();
		Clock customClock = new Clock(15, 45, 30);
		Clock secondsClock = new Clock(54530); // 15 hours, 25 minutes, 30 seconds
		
        System.out.println("Default constructor: " + defaultClock);
        System.out.println("Custom constructor: " + customClock);
        System.out.println("Seconds constructor: " + secondsClock);

// Read seconds since midnight for firstClock
        
        System.out.print("Enter seconds since midnight for firstClock: ");
        
        int secondsSinceMidnight = scanner.nextInt();
        Clock firstClock = new Clock(secondsSinceMidnight);

 // Tick firstClock ten times and print the time
         
        System.out.println("Ticking firstClock:");
        
        for (int i = 0; i < 10; i++) {
            firstClock.Tick();
            System.out.println(firstClock);
        }

  // Read hours, minutes, and seconds for secondClock
        
        System.out.print("Enter hours, minutes, and seconds for secondClock: ");
        
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();
        
        Clock secondClock = new Clock(hours, minutes, seconds);

        // Tick secondClock ten times and print the time
        
        System.out.println("Ticking secondClock:");
        for (int i = 0; i < 10; i++) {
            secondClock.Tick();
            System.out.println(secondClock);
        }
        
  // Add secondClock time to firstClock
        
        firstClock.addClock(secondClock);
        
        System.out.println("After adding secondClock time to firstClock:");
        System.out.println("firstClock: " + firstClock);
        System.out.println("secondClock: " + secondClock);
        
  // ThirdClock ( difference between firstClock and secondClock )
        
        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("thirdClock (difference between firstClock and secondClock): " + thirdClock);

        scanner.close();
	}

}
