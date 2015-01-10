//create an array. Then create two different arrays 
//one with the odd #s and one with the even #s
import java.util.Scanner;
class sort_odd_even 
{
	public static void main(String[] args) 
	{
		int a[] = new int[4];
		int b[] = new int[4];
		int c[] = new int[4];
		Scanner in = new Scanner(System.in);
		for(int x=0;x<a.length;++x)
		{
			System.out.println("Enter a #");
			a[x] = in.nextInt();
		}
		for(int x=0;x<a.length;++x)
		{
			int ch=a[x];
			if((ch%2)==0)
			{
				ch=b[x];
			}
			else
			{
				ch=c[x];
			}
		}

	}
}
