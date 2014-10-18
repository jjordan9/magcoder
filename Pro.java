import java.text.*;
import java.util.Scanner;
class Pro 
{
	public static void main(String[] args) 
	{
		int a, b, c;
		double avg;
		Scanner in = new Scanner(System.in);
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		System.out.println("Enter first test score: ");
		a=in.nextInt();
		System.out.println("Enter second test score: ");
		b=in.nextInt();
		System.out.println("Enter third test score: ");
		c=in.nextInt();
		avg=meth2(a,b,c);
		System.out.println(twoDForm.format(avg));
		if(avg>=90)
		{
			System.out.println("You have an a");
        }
		else
		{
		if(avg>=80)
		{
			System.out.println("You have a b");
		}
		else
		{	
		if(avg>=70)
		{
			System.out.println("You have a c");
		}
		else
	
		if(avg>=65)
		{
		System.out.println("You have a d");
		}
		else
		{
			System.out.println("Switch majors");
		}
	}
		}
	}


		public static double meth2(int x,int y,int z)
	{
		double avg;
		avg=(double)(x+y+z)/3;
		return avg;

	}
}
