package airline;

public class AirlineTicketMain {

	public static void main(String[] args) {
		
		SeatAssignment seat1 = new SeatAssignment(12, 'F');
        SeatAssignment seat2 = new SeatAssignment(7, 'A');

        AirlineTicket ticket1 = new AirlineTicket("New York", "Los Angeles", "AA123", seat1);
        AirlineTicket ticket2 = new AirlineTicket("Chicago", "Miami", "UA456", seat2);

        System.out.println(ticket1);
        System.out.println(ticket2);

	}

}
