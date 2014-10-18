import java.util.Scanner;
class Wt 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double b, Sum;
		Sum=meth2();
		System.out.println();
	}
	public static String meth3()
	{
		String name;
		System.out.println("enter student name");
		name=in.

	public static double meth2()
	{
		double Sum;
		int a,b,c;
		System.out.println(" enter test 1");
		a=in.nextInt();
		System.out.println("enter test 2");
		b=in.nextInt();
		System.out.println("enter test 3");
		c=in.nextInt();
		Sum=(double)a+b+c;
		return Sum;
	}
}
