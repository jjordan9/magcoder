class Lab12 
{
	public static void main(String[] args) 
	{
		double w, newbalance;
		Account acc1 = new Account();
		double id = acc1.getId();
		double balance = acc1.getBal();
		double annualInterestRate = acc1.getRate();
		newbalance = acc1.withdraw(w);
		System.out.println(newbalance);

		


	}
}
