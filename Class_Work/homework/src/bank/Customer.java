package bank;

public class Customer {
	
	 private String firstName;
	    private String lastName;

	    public Customer(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    @Override
	    public String toString() {
	        return "Customer{" +
	                "firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                '}';
	    }
	}
