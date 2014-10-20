import java.util.Scanner;
class Calling 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		char b=0;
		System.out.println("Hello World!");
		System.out.println("Enter a number");
		b=in.next().charAt(0);
		meth2(b);
	}
	public static void meth2(char b)
	{
		if(b>55)
		{
			System.out.println("Over 55");
		}
		else if(b<50)
		{
			System.out.println("Under 50");
		}
		else
			System.out.println("Between 50 and 55");

	}
}
