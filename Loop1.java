import java.util.Scanner;
class Loop1 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		/*int x;
		for(x=1;x<5;x++)
			System.out.println("yes");
		theCalled();

	}
	public static void theCalled()
	{
		int x=1;
		while(x<5)
		{
			System.out.println("no");
			x++;
		}*/
		int x;
		int runningSum=0;
		int runningCount=0;
		double avg;
		System.out.println("Enter a number");
		x=in.nextInt();
		while(x!=0)
		{
			++runningCount;
			runningSum=runningSum+x;
			System.out.println("Enter a number");
			x=in.nextInt();
		}
		if(runningCount==0)
		{
			System.out.println("invalid");
		}
		else
		{
		avg=(double)runningSum/runningCount;
		System.out.println("number of numbers entered = "+runningCount);
		System.out.println("Average = "+avg);
		}
	}
			
}
