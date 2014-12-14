import java.text.*;
import java.util.Scanner;
class Lab6 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int years=0;
		System.out.print("Enter the amount invested: ");
		double investmentAmount=in.nextDouble();
		System.out.print("Enter annual interest rate: ");
		double monthlyInterestRate=in.nextDouble();
		System.out.println("Years        Future Value");
		for(years=1;years<=30;years++)
		{
			DecimalFormat twoDForm = new DecimalFormat("#.##");
			double futureValue = futureInvestmentValue
				(investmentAmount, monthlyInterestRate, years);
			System.out.println(years+"\t\t"+"$"+twoDForm.format(futureValue));
		}
	}
	public static double futureInvestmentValue(
		double investmentAmount, double monthlyInterestRate, int years)
	{
		double futureValue;
		futureValue=
			investmentAmount*(Math.pow((1+(monthlyInterestRate/1200)),(years*12)));
		//double mult=monthlyInterestRate/100+1;
		//double power=Math.pow(mult, years);
		//double futureValue=investmentAmount*power;
		return (double)futureValue;
	}
}
//===============================================================================


