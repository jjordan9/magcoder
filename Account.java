;import java.util.Scanner;
import java.util.Date;
class Account
{
  // Instance Variables
  // note that these are not static!!
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
  
  public String toString()
  {
    String retval = "";
    retval += "\n";
    retval += "*************************\n";
    retval += "id\t\t"+getId()+"\n";
    retval += "balance\t\t"+getBal()+"\n";
    retval += "annualInterestRate\t\t"+getRate()+"\n";
    retval += "monthlyInterestRate\t\t"+getMonthlyRate()+"\n";
    retval += "monthlyInterest\t\t"+getInterest()+"\n";
    retval += "dateCreated\t\t"+dateCreated+"\n";
    retval += "*************************\n";
    retval += "\n";
    return retval;
  }

  // Constructor #2
  public Account(int i, double bal)
	{
		id=i;
 		balance=bal;
		annualInterestRate=0;
		dateCreated = new Date();
	}
  // Constructor #1
  public Account()
	{
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated = new Date();
	}
	public double getId()
	{
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
		double monthlyRate=(annualInterestRate/12);
		return monthlyRate;
	}
	public double getInterest()
	{
		return (balance*(annualInterestRate/12));
	}
  // Note that i've made withdraw return the new balance
	public double withdraw(double w)
	{
    balance = balance - w;
    return balance;
	}
  // Note that i've made deposit return the new balance
	public double deposit(double d)
	{
    balance = balance + d;
    return balance;
	}
}
