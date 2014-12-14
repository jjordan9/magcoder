import java.util.Scanner;
class PassRef2
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a[] = new int[10];
		int first=0;
		PickEm(a);
		ShowEm(a,first);
		SortEm(a);
		//System.out.println("Sorted");
		//System.out.println("===============================");
		ShowEm(a,first);
		++first;
		CountEm(a);
		System.out.println("no dups");
		System.out.println("===============================");
		DropEm(a);
		ShowEm(a,first);
	}
	public static void CountEm(int a[])
	{
		int count, compare;
		count = 1;
		compare = a[0];
		System.out.println("numbers   freq");
		System.out.println("===============================");
		for(int x=1;x<a.length;++x)
		{
			if(compare == a[x])
				++count;
			else
			{
					System.out.println(compare+"    "+count);
					compare=a[x];
					count=1;
			}
		}
		System.out.println(compare+"    "+count);
	}
	public static void DropEm(int a[])
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
	public static void SortEm(int a[])
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
	public static void PickEm(int a[])
	{
		//Random pik = new Random();
		System.out.print("Enter ten numbers: ");
		for(int x=0;x<=9;++x)
		{
			a[x]=in.nextInt();
		}
	}
	public static void ShowEm(int a[],int first)
	{
		if(first==0)
		{
			for(int x=0;x<=9;++x)
			{
				System.out.print(a[x]+",");
			}
			System.out.println();
		}else
			for(int x=0;x<=9;++x)
			{
				if(a[x] !=0)
					System.out.print(a[x]+" ");
			}
	}
	
}
