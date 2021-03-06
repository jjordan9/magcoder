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
		System.out.println("Interest Rate"+"\t"+"Monthly Payment"+"\t"+"Total Payment");
		System.out.println();
		for(annualInterestRate=5;annualInterestRate<=8;annualInterestRate+=0.125)
		{

			monthlyInterestRate=(annualInterestRate/100)/12;
			monthlyPayment=(loanAmount*monthlyInterestRate)/
			(1-Math.pow(1/(1+monthlyInterestRate), numberOfPayments));
			totalPayment=monthlyPayment*numberOfPayments;
			System.out.println(annualInterestRate+"%\t\t"+"$"
			+twoDForm.format(monthlyPayment)+"\t\t"
			+"$"+twoDForm.format(totalPayment));
		}


	}
}
//==================================================================
/*Enter loan amount: 10000
Enter the loan period in years: 5
Interest Rate   Monthly Payment Total Payment

5.0%            $188.71         $11322.74
5.125%          $189.29         $11357.13
5.25%           $189.86         $11391.59
5.375%          $190.44         $11426.11
5.5%            $191.01         $11460.7
5.625%          $191.59         $11495.35
5.75%           $192.17         $11530.06
5.875%          $192.75         $11564.84
6.0%            $193.33         $11599.68
6.125%          $193.91         $11634.59
6.25%           $194.49         $11669.56
6.375%          $195.08         $11704.59
6.5%            $195.66         $11739.69
6.625%          $196.25         $11774.85
6.75%           $196.83         $11810.08
6.875%          $197.42         $11845.37
7.0%            $198.01         $11880.72
7.125%          $198.6          $11916.14
7.25%           $199.19         $11951.62
7.375%          $199.79         $11987.16
7.5%            $200.38         $12022.77
7.625%          $200.97         $12058.44
7.75%           $201.57         $12094.18
7.875%          $202.17         $12129.97
8.0%            $202.76         $12165.84*/
