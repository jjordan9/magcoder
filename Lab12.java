class Lab12 
{
  public static void main(String[] args)
  {
		Account account = new Account(1122,(double)20000);
    //System.out.println("Account after creation: "+account);

    account.setRate(.045);
    //System.out.println("Account after setRate: "+account);

    account.withdraw(2500);
    //System.out.println("Account after withdraw: "+account);

    account.deposit(3000);
    //System.out.println("Account after deposit: "+account);

    System.out.println("Account Balance is:"+account.getBal());
    System.out.println("Monthly Interest is:"+account.getInterest());
    System.out.println("Account Creation Date is:"+account.getDate());
  }
}
