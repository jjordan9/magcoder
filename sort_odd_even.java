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
		for(int x=0;x<a.length;++x)				//<=I'm pretty sure that this is where my shit is
		{											
			if(a[x]<0)							
				a[x]=negativeList[x];
			else if(a[x]%2==0)					//<=flawed..I googled the shit out of it but still no 
				a[x]=evenList[x];
			else
				a[x]=oddList[x];
												//<=good...Let me know wen u can..Thanks!!!!
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
/*output is
Enter a #
-1
Enter a #
1
Enter a #
2
Enter a #

3
Enter a #
4
Enter a #
5
Enter a #
6
Enter a #
7
Enter a #
8
Enter a #
9
EvenList: 0000000000
OddList: 0000000000
NegativeList: 0000000000*/