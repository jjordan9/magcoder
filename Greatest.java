import java.util.Scanner;
class Greatest 
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int numbers[] = new int [5];
		int x,greatest;
		LoadArray(numbers);
		greatest=FindHi(numbers);
		System.out.println("The highest value entered was "+greatest);
	}
	public static int FindHi(int a[])
	{
		int hi;
		int x;
		hi=a[0];
		for(x=0;x<=4;++x)
		{
			if(hi<a[x])
				hi=a[x];
		}
		return hi;
	}
	public static void LoadArray(int a[])
	{
		int x;
		for(x=0;x<=4;++x)
		{
			System.out.print("Enter a value #"+(x+1)+" now: ");
			a[x]=in.nextInt();
		}
		
	}

}
