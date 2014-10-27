import java.util.Scanner;
import java.text.*;
import java.lang.Math;
class Lab5 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		System.out.print("Enter loan amount: ");
		double loanAmount=in.nextDouble();
		System.out.print("Enter the loan period in years: ");
		int loanPeriod=in.nextInt();
		double annualInterestRate=5;
		double monthlyInterestRate=(annualInterestRate/100)/12;
		int numberOfPayments=loanPeriod*12;
		double monthlyPayment=(loanAmount*monthlyInterestRate)/
			(1-Math.pow(1/(1+monthlyInterestRate), numberOfPayments));
		double totalPayment=monthlyPayment*numberOfPayments;
		System.out.println("Interest Rate"+"\t"+"Monthly Payment"+"\t"+"Total payment");
		System.out.println(" ");
		for(annualInterestRate=5;annualInterestRate<=8;annualInterestRate+=0.125)
		{

			monthlyInterestRate=(annualInterestRate/100)/12;
			monthlyPayment=(loanAmount*monthlyInterestRate)/
			(1-Math.pow(1/(1+monthlyInterestRate), numberOfPayments));
			totalPayment=monthlyPayment*numberOfPayments;
			System.out.println(annualInterestRate+"%\t\t"+"$"+twoDForm.format(monthlyPayment)+"\t\t"
			+"$"+twoDForm.format(totalPayment));
		}


	}
}
