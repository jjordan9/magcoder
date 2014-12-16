class Lab12 
{
	public static void main(String[] args) 
	{
		double w, balance,a;
		Account acc1 = new Account();
		double id = acc1.getId();
		balance = acc1.getBal();
		double annualInterestRate = acc1.getRate();
		balance = acc1.withdraw(balance);
		balance = acc1.deposit();
		System.out.println(balance);
		
		
		


	}
}
