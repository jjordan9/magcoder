import java.util.Scanner;
class  Trio
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int first[] = new int[3];
		int retarray[] = new int [3];
		for(int x=0;x<=2;++x)
		{
			System.out.print("Enter value");
			first[x]=in.nextInt();
		}
		Two(first, retarray);
		for(int x=0;x<=2;++x)
		{
			System.out.println("First = "+first[x]+" Three = "+retarray[x]);
		}
	}
	public static void Two(int first[],int retarray[])
	{
		int second[] = new int[3];
		for(int x=0;x<=2;++x)
		{
			System.out.print("Enter a value");
			second[x]=in.nextInt();
		}
		Third(first,second,retarray);
	}
	public static void Third(int a[], int b[],int retarray[])
	{
		int three[] = new int[3];
		for(int x=0;x<=2;++x)
		{
			three[x]=a[x]+b[x];
			retarray[x]=three[x];
		}
	}
}
