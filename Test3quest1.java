//An array is defined as int a(10);
//The value of 24 may or may not be in the array.Write the 
//code to display the location of that value. If it does not 
//exist display the appropriate message indicating it is 
//not in the array

import java.util.Scanner;
class Test3quest1 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		int x;
		for(x=0;x<a.length;++x)
		{
			//int ch = a[x];
			System.out.println("Enter a number");
			//ch = in.nextInt();
			a[x] = in.nextInt();
			//if(ch==24)
			//{
				//System.out.println("24 is located in the "+x+" location of array a");
			//}
			//System.out.println("24 not in array a");
		}
		for(x=0;x<a.length;++x)
		{
			int ch = a[x];
			if(ch==24)
			{
				System.out.println("24 is located in the "+x+" location of array a");
			{
						
		}

	}

}
