import java.util.Scanner;
class While 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int count=0;
		int valuein;
		int sum=0;
		int avg;
		System.out.print("Enter a value here; -99 terminates: ");
		valuein=in.nextInt();
		while(valuein != -99)
		{
			++6count;
			sum=sum+valuein;
			System.out.print("Enter a value here; -99 terminates: ");
			valuein=in.nextInt();
		//}
		//avg=sum/count;
		//System.out.println("average = "+avg);
		System.out.println("# of values entered = "+count);
}
}
}