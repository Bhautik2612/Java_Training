package day_2_Q2_clock;

public class Clock {
	
	private int hours,minutes,seconds;
	
//	Default constructor
	
	 public Clock() {
	        this.hours = 12;
	        this.minutes = 0;
	        this.seconds = 0;
	    }
	 
//	Constructor with Parameters
	 
	 public Clock(int hours, int minutes, int seconds) {
		 
		 if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
	            throw new IllegalArgumentException("Invalid time value");
	        }
		 
		 this.hours = hours;
		 this.minutes = minutes;
		 this.seconds = seconds;
	 }
	 
// Constructor with Time in Seconds Since Midnight
	 
	    public Clock(int totalSeconds) {
	    	
	    	  if (totalSeconds < 0) {
	              throw new IllegalArgumentException("Total seconds cannot be negative");
	          }
	        
	        this.hours = (totalSeconds / 3600);
	        this.minutes = (totalSeconds % 3600) / 60;
	        this.seconds = totalSeconds % 60;
	    }
	    
 // Tick Method with no Parameters
	    
	    public void Tick() {
	    	seconds++;
	        if ( seconds == 60 ) {
	        	seconds = 0;
	        	 minutes++;
		            if (minutes == 60) {
		                minutes = 0;
		                hours = (hours + 1);
		            }
	        }
	    }
	    
 public void addClock(Clock other) {
	    	
	        int totalSeconds = this.toSeconds() + other.toSeconds();
	        this.hours = (totalSeconds / 3600);
	        this.minutes = (totalSeconds % 3600) / 60;
	        this.seconds = totalSeconds % 60;
	    }

// Method to subtract the time of another clock
 
	    public Clock subtractClock(Clock other) {
	        int totalSeconds = this.toSeconds() - other.toSeconds();
	        if (totalSeconds < 0) {
	            totalSeconds += 24 * 3600; // Handle negative difference by adding one day
	        }
	        return new Clock(totalSeconds);
	    }

// Convert the current time to total seconds since midnight
	    
	    private int toSeconds() {
	        return hours * 3600 + minutes * 60 + seconds;
	    }
	    
	   

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	@Override
	 public String toString() {
        return String.format("Clock [%02d:%02d:%02d]", hours, minutes, seconds);
    }
	 

}
