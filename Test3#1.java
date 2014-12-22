//An array is defined as int a(10);
//Thed value of 24 may or may not be in the array.Write the 
//code to display the location of that value. If it does not 
//exist display the appropriate message indicating it is 
//not in the array

import java.util.Scanner;
class Test3#1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		int x;
		for(x=0;x<a.length;++x)
		{
			System.out.println("Enter a number");
			a[x] = in.nextInt;
			char ch = a[x];
			if(ch==24)
			{
				System.out.println("24 is located in the "+x+" location of array a");
			}
			else
			{
				System.out.println("24 is not in array a");
			}
		}
	}
}
