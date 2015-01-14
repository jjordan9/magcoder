//import java.util.List;
//import java.util.ArrayList;
import java.util.Scanner;
class odd_even_neg_1
{												
	public static void main(String[] args)		
	{											  
		int a[] = new int[10];
        int odd_count = 0;
        int even_count = 0;
        int neg_count = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a ten numbers: ");
		for(int x=0;x<a.length;++x)		
		{
			a[x] = in.nextInt();
            // TODO MAG: in this loop increment all the counts
		}
        // at this point the counts should be set properly
		int oddList[] = new int[odd_count];
		int negativeList[] = new int[neg_count];
		int evenList[] = new int[even_count];
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
	
