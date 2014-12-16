;import java.util.Scanner;
import java.util.Date;
class Account
{
	private static int id;
	private static double balance;
	private static double annualInterestRate;
	private static Date dateCreated;
    public Date Lab12()
	{
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated = new Date();
		return dateCreated;
	}
	public Date Lab12(int i,double bal)
	{
		id=i;
 		balance=bal;
		annualInterestRate=0;
		dateCreated = new Date();
		return dateCreated;
	}
	public double getId()
	{
		id = 1122;
		return id;
	}
	public double getBal()
	{
		double balance = 20000;
		return balance;
	}
	public double getRate()
	{
		annualInterestRate=4.5;
		return annualInterestRate;
	}
	public void setId(int i)
	{
		id=i;
	}
	public void setBal(double b)
	{
		balance=b;
	}
	public void setRate(double r)
	{
		annualInterestRate=r;
		r=4.5;
	}
	public Date getDate()
	{
		return dateCreated;
	}
	public void setDate(Date d)
	{
		dateCreated=d;
	}
	public double getMonthlyRate()
	{
		annualInterestRate=4.5;
		double monthlyRate=(annualInterestRate/12);
		return monthlyRate;
		
	}
	public double getInterest()
	{
	
		return (balance*(annualInterestRate/12));
	}
	public double withdraw(double w)
	{
		double balance;
		balance=getBal();
		w = 2500;
		balance=balance-w;
		return balance;
	}
	public void deposit(double d)
	{
		double balance,w;
		balance=withdraw(w);
		d = 3000;
		balance=balance+d;
		
	}
}
