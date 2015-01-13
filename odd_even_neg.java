//import java.util.List;
//import java.util.ArrayList;
import java.util.Scanner;
class odd_even_neg 
{												
	public static void main(String[] args)		
	{											  
		int a[] = new int[10];
		int evenList[] = new int[a.length];		
		int oddList[] = new int[a.length];
		int negativeList[] = new int[a.length];
		//List<Integer> evenList = new ArrayList<Integer>();
		//List<Integer> oddList = new ArrayList<Integer>();
		//List<Integer> negativeList = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a ten numbers: ");
		for(int x=0;x<a.length;++x)		
		{
			a[x] = in.nextInt();
		}
		int count = 0;
		for(int x=0;x<a.length;++x)	
		{
			if(a[x]<0)
			{
				negativeList[count]=a[x];
				count++;
			}
		} 
		count = 0;
		for(int x=0;x<a.length;++x)
		{
			if(a[x]%2==0)
			{
				evenList[count]=a[x];
				count++;
			}
		}
		count = 0;
		for(int x=0;x<a.length;++x)
		{
			if((a[x]>0)&&(a[x]%2!=0))
			{
				oddList[count]=a[x];
				count++;
			}
		}
		System.out.print("EvenList: ");
		for(int x=0;x<evenList.length;++x)
		{
			System.out.print(evenList[x]+" ");	
		}
		System.out.println();
		System.out.print("OddList: ");
		for(int x=0;x<oddList.length;++x)
		{
			System.out.print(oddList[x]+" ");	
		}
		System.out.println();
		System.out.print("NegativeList: ");
		for(int x=0;x<negativeList.length;++x)
		{
			System.out.print(negativeList[x]+" ");
		}
	}
}
/*
Enter a ten numbers: -1 1 2 3 4 5 6 7 8 9
EvenList: 2 4 6 8 0 0 0 0 0 0
OddList: 1 3 5 7 9 0 0 0 0 0
NegativeList: -1 0 0 0 0 0 0 0 0 0
*/
	
