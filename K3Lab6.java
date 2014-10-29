import java.text.*;
import java.util.Scanner;
class Lab6 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		double investmentAmount, monthlyInterestRate;
		int years=0, future;
		System.out.print("Enter the amount invested: ");
		investmentAmount=in.nextDouble();
		System.out.print("Enter annual interest rate: ");
		monthlyInterestRate=in.nextDouble();
		System.out.println("Years        Future Value");
		for(years=1;years<=30;years++)
		{
      double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
			System.out.println(years+"\t\t"+twoDForm.format(futureValue));
    }

	}
	public static double futureInvestmentValue(
		double investmentAmount, double monthlyInterestRate, int year)
	{
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		double mult=monthlyInterestRate/100+1;
		double power=Math.pow(mult, years);
		double futureValue=investmentAmount*power;
    mult=monthlyInterestRate/100+1;
    power=Math.pow(mult, year);
    futureValue=investmentAmount*power;
		return (double)futureValue;
	}
}

