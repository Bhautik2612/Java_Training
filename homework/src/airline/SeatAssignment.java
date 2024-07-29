package airline;

public class SeatAssignment {
	
	 private int row;
     private char seatLetter;

     public SeatAssignment(int row, char seatLetter) {
         this.row = row;
         this.seatLetter = seatLetter;
     }

     public int getRow() {
         return row;
     }

     public char getSeatLetter() {
         return seatLetter;
     }

     @Override
     public String toString() {
         return row + "" + seatLetter;
     }
 }


