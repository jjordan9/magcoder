import java.util.Scanner;
class Freestyle 
{
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
	int a,b,c,avg,min;
	String name;
	System.out.println("Wats ur name");
	name=in.nextLine();
	System.out.println("enter number 1");
	a=in.nextInt();
	System.out.println("enter number 2");
	b=in.nextInt();
	System.out.println("enter number 3");
	c=in.nextInt();
	avg=meth2(a,b,c);
	min=meth3(a,b,c);
	System.out.println(avg);
	if (avg>=50)
		System.out.println("word");
	else 
		System.out.println("nope");
		System.out.println(min);
	if(min<50)
		System.out.println("Ok");
	else
		System.out.println("No");
	}
	public static int meth2(int x,int y,int z)
	{
		int avg;
		avg=(x+y+z)/3;
		return avg;
	}
	public static int meth3(int d,int e,int f)
	{
		int min;
		min=d-e-f;
		return min;
	}

}