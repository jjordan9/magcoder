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
		int i = 0,key = 24;
		for(i=0; i<a.length; ++i)
		{
			System.out.println("Enter a number");;
			a[i] = in.nextInt();
		}
		boolean found = false;
		isthere(a, key, found);
	}
	public static void isthere(int [] a, int key, boolean found)
	{
		
       for (int i = 0; i < a.length; i++)
      {
          if( a[i]== key )
		  {
			   found = true;
			   System.out.println("24 is located at the "+i+" location of array a");
          }
	  }
	  if(found)
	  {
		  System.out.println();
	  }
	  else
		System.out.println("24 is not in array a ");
	}
}
		