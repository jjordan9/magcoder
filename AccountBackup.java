import java.util.Scanner;
import java.util.Date;
class AccountBackup
{
	private static int id;
	private static double balance;
	private static double annualInterestRate;
	private static Date dateCreated;
    public  Lab12()
	{
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated = new Date();
	}
	public Lab12(int i,double bal)
	{
		id=i;
 		balance=bal;
		annualInterestRate=0;
		dateCreated = new Date();
	}
	public double getId()
	{
		//double id = 1122
		return id;
	}
	public double getBal()
	{
		return balance;
	}
	public double getRate()
	{
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
		return (annualInterestRate/12);
	}
	public double getInterest()
	{
		return (balance*(annualInterestRate/12));
	}
	public void withdraw(double w)
	{
		balance=balance-w;
	}
	public void deposit(double d)
	{
		balance=balance+d;
	}
}

