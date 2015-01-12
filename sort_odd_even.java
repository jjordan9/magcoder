//write a program that takes 10 integers as input.The program 
//places the even integers into an array called evenList
//the odd into an array called oddList and any negative
//values into an array called negativeList.The program will
//display the contents of the 3 arrays after all the integers
//have been entered.
import java.util.Scanner;
class sort_odd_even 
{
	public static void main(String[] args) 
	{
		int a[] = new int[10];
		int evenList[] = new int[a.length];
		int oddList[] = new int[a.length];
		int negativeList[] = new int[a.length];
		Scanner in = new Scanner(System.in);
		for(int x=0;x<a.length;++x)
		{
			System.out.println("Enter a #");
			a[x] = in.nextInt();
		}
		for(int x=0;x<a.length;++x)		
		{
			int count=0;
			if(a[x]<0)
			{
				negativeList[x]=a[x];
			}
			else if(a[x]%2==0)
			{
				evenList[x]=a[x];
			}
			else
			{
				oddList[x]=a[x];
			}
											
		}
		System.out.print("EvenList: ");
		for(int x=0;x<evenList.length;++x)
		{			
			System.out.print(evenList[x]);	
		}
		System.out.println();
		System.out.print("OddList: ");
		for(int x=0;x<oddList.length;++x)
		{
			System.out.print(oddList[x]);	
		}
		System.out.println();
		System.out.print("NegativeList: ");
		for(int x=0;x<negativeList.length;++x)
		{
			System.out.print(negativeList[x]);	
		}
	}
}
