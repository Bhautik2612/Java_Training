package bankaccount;

public class TestBankAccount {

	public static void main(String[] args) {
		
	SavingsAccount sa = new SavingsAccount();
	CurrentAccount ca = new CurrentAccount();
	
	sa.deposit();
	sa.withdraw();
	ca.deposit();
	ca.withdraw();
	
		
	}

}
