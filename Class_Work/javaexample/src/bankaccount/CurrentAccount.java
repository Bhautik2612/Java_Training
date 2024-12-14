package bankaccount;

public class CurrentAccount extends BankAccount {

	@Override
	public void deposit() {
		System.out.println("Deposit in Current Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Deposit from Current Account");
	}
	
}
