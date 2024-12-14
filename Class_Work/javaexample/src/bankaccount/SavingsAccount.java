package bankaccount;

public class SavingsAccount extends BankAccount {

	@Override
	public void deposit() {
		System.out.println("Deposit in Saving Account");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw from Saving Account");		
	}
}
