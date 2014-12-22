import java.util.Scanner;
class PassValue 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int x;
		GetData(a);
		for(x=0;x<=4;++x)
		{
			System.out.print(a[x]+",");
		}
		AddEm(a);
		System.out.println(a[x]);

	}
	public static void GetData(int a[])
	{
		Scanner in = new Scanner(System.in);
		int x;
		for(x=0;x<=4;++x)
		{
			System.out.println("Enter a # here");
			a[x]=in.nextInt();
		}
	}
	public static void AddEm(int a[])
	{
		int x;
		for(x=0;x<=4;++x)
		{
			a[x]=a[x+1]+a[x];
		}
	}
}
