package bank;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer("Bhautik", "Karad");

        Account account1 = new Account(customer, 1500.00);
        Account account2 = new Account(customer, 2500.00);

        System.out.println(account1);
        System.out.println(account2);

	}

}
