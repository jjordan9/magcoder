import java.util.Scanner;
class PassValue 
{
	public static void main(String[] args) 
	{
		int a[] = new int[5];
		int x=GetData(a);
		System.out.println(a+" was entered");
	}
	public static int GetData(int a[])
	{
		Scanner in = new Scanner(System.in);
		int x;
		for(x=0;x<=4;++x)
		{
			System.out.println("Enter a # here");
			a[x]=in.nextInt();
		}
		return x;
	}
}
