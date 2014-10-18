import java.util.Scanner;
class Scope 
{
	

	public static void main(String[] args)
	{
		int a;
		int b;
		int c;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first value here: ");
		a=in.nextInt();
		System.out.print("Enter second value here: ");
		b=in.nextInt();
		c=meth2(a,b);
		System.out.println("Sum = "+c);
	}
	public static int meth2(int x,int y)
	{
	int z;
	   z=x+y;
	   return z;
	}
}


