import java.util.Scanner;
class Lab10
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[] = new int[10];
		int first=0;
		ChooseThem(a);
		++first;
		PrintThem(a,first);
	}
	public static void CountThem(int a[])
	{
		int count, compare;
		count = 1;
		compare = a[0];
		for(int x=1;x<a.length;++x)
		{
			if(compare == a[x])
				++count;
			else
			{
				compare=a[x];
				count=1;
			}
		}
	}
	public static void eliminateDuplicates(int a[])
	{
		int compare;
		compare=a[0];
		for(int x=1;x<a.length;++x)
		{
			if (compare==a[x])
				a[x]=0;
			else
				compare=a[x];	
		}
	}
	public static void SortThem(int a[])
	{
		int hold;
		for(int x=0;x<(a.length)-1;++x)
		{
			if(a[x]>a[x+1])
			{
				hold=a[x];
				a[x]=a[x+1];
				a[x+1]=hold;
				x=-1;
			}
		}
	}
	public static void ChooseThem(int a[])
	{
		System.out.print("Enter ten numbers: ");
		for(int x=0;x<=9;++x)
		{
			a[x]=in.nextInt();
		}
	}
	public static void PrintThem(int a[],int first)
	{
		SortThem(a);
		CountThem(a);
		eliminateDuplicates(a);
		System.out.print("The distinct numbers are: ");
		if(first==0)
		{
			for(int x=0;x<=9;++x)
			{
				System.out.print(a[x]+",");
			}
		System.out.println();
		}
		else
		{
			for(int x=0;x<=9;++x)
			{
				if(a[x] !=0)
					System.out.print(a[x]+" ");
			}
		}
	
	}
}
/*=======================================================
Enter ten numbers: 1 1 1 1 1 22 33 34 5 5
The distinct numbers are: 1 5 22 33 34*/