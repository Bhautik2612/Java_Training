package airline;

public class AirlineTicket {
	
	 private String departureCity;
	    private String arrivalCity;
	    private String flightNumber;
	    private SeatAssignment seatAssignment;

	    public AirlineTicket(String departureCity, String arrivalCity, String flightNumber, SeatAssignment seatAssignment) {
	        this.departureCity = departureCity;
	        this.arrivalCity = arrivalCity;
	        this.flightNumber = flightNumber;
	        this.seatAssignment = seatAssignment;
	    }

	    public String getDepartureCity() {
	        return departureCity;
	    }

	    public String getArrivalCity() {
	        return arrivalCity;
	    }

	    public String getFlightNumber() {
	        return flightNumber;
	    }

	    public SeatAssignment getSeatAssignment() {
	        return seatAssignment;
	    }

	    @Override
	    public String toString() {
	        return "AirlineTicket{" +
	                "departureCity='" + departureCity + '\'' +
	                ", arrivalCity='" + arrivalCity + '\'' +
	                ", flightNumber='" + flightNumber + '\'' +
	                ", seatAssignment=" + seatAssignment +
	                '}';
	    }

}
