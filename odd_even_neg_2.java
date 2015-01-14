import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
class odd_even_neg_2
{												
	public static void main(String[] args)		
	{											  
		int a[] = new int[10];
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		List<Integer> negativeList = new ArrayList<Integer>();
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
				negativeList.add(a[x]);
			}
		} 
		for(int x=0;x<a.length;++x)
		{
            // bug: negative even numbers?
			if(a[x]%2==0)
			{
				evenList.add(a[x]);
			}
		}
		for(int x=0;x<a.length;++x)
		{
			if((a[x]>0)&&(a[x]%2!=0))
			{
                oddList.add(a[x]);
			}
		}
        // Note use of size() and get() instead of length and []
        // See: http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
		System.out.print("EvenList: ");
		for(int x=0;x<evenList.size();++x)
		{
			System.out.print(evenList.get(x)+" ");	
		}
		System.out.println();
		System.out.print("OddList: ");
		for(int x=0;x<oddList.size();++x)
		{
			System.out.print(oddList.get(x)+" ");	
		}
		System.out.println();
		System.out.print("NegativeList: ");
		for(int x=0;x<negativeList.size();++x)
		{
			System.out.print(negativeList.get(x)+" ");
		}
	}
}
/*
Enter a ten numbers: -1 1 2 3 4 5 6 7 8 9
EvenList: 2 4 6 8 0 0 0 0 0 0
OddList: 1 3 5 7 9 0 0 0 0 0
NegativeList: -1 0 0 0 0 0 0 0 0 0
*/
	
