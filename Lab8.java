
import java.util.Scanner;
class Lab8 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int[] integer = new int[10];
		System.out.print("Enter ten integers between one and hundred: ");
		for(int x=0;x<integer.length;++x)
		{
			integer[x]=in.nextInt();
		}
		CountThem(integer);
	}
	public static void CountThem(int[] a)
	{
		SortThem(a);
		int count, compare;
		count = 1;
		compare = a[0];
		for(int x=1;x<a.length;++x)
		{
			if(compare == a[x])
				++count;
			else if(count==1)
			{
				System.out.println(compare+" occurs "+count+" time");
				compare=a[x];
				count=1;
			}
			else
			{
				System.out.println(compare+" occurs "+count+" times");
				compare=a[x];
				count=1;
			}
		}

	}
	public static void SortThem(int[] a)
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

}

