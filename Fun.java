import java.text.*;
import java.util.Scanner;
class Fun 
{
	public static void main(String[] args) 
	{
		int a, b, c;
		double avg;
		int few;
		Scanner in = new Scanner(System.in);
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		System.out.println("give a #");
		a=in.nextInt();
		System.out.println("give a second #");
		b=in.nextInt();
		System.out.println("give third #");
		c=in.nextInt();
		avg=meth2(a,b,c);
		few=meth3(a,b,c);
		//if((a==b)||(b==c)&&(a==b))
		//}	
		System.out.println(twoDForm.format(avg));
		if(avg>50)
		{
			System.out.println("yeaaa boyyy");
		}
		else
		{
		if(avg<=50)
		{
			System.out.println("nahhh sonn");


	/*	{
			System.out.println("nice");
		}
		else
		{
			System.out.println("nope");
		}*/


		System.out.println(twoDForm.format(avg-few));
		}}
}
	
		public static double meth2(int x,int y,int z)
	{
		double avg;
		avg=(double)(x+y+z)/3;
		return avg;
}
		public static int meth3(int x, int y,int z)
	{
		int minus;
		minus=(int)x-y-z;
		return minus;
	}
}