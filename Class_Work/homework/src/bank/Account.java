package bank;

public class Account {
    private Customer customer;
    private double balance;

    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", balance=" + balance +
                '}';
    }
}
