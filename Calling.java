import java.util.Scanner;
class Calling 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		char b=0;
		System.out.println("Hello World!");
		System.out.println("Enter a character");
		b=in.next().charAt(0);
		meth2(b);
	}
	public static void meth2(char b)
	{
		if(b!='a')
		{
		System.out.println("Hey You");
		}
		else
			System.out.println("Boo");
	}
}
