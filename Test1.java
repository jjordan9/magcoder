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
			int ch = a[x];
			System.out.println("Enter a number");
			ch = in.nextInt();
			if(ch==24)
			{
				System.out.println("24 is located in the "+x+" location of array a");
				System.out.println("Enter a number");
				ch = in.nextInt();

			}
		}
		int ch= a[x];
		if(ch!=24)
		{
			System.out.println("24 not in array a");
		}
		
	}
}
