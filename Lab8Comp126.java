import java.util.Scanner;
class Lab8Comp126 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int x,y=5;
		System.out.println("Enter #");
		x=in.nextInt();
		int runningCount=0;
		while(x!=y)
		{
			if(x<y)
			{
	      		System.out.println("Your guess is too low");
				runningCount++;
				System.out.println("Enter #");
				x=in.nextInt();
			}
			else if(x>y)
			{
				System.out.println("too high");
				runningCount++;
				System.out.println("Enter #");
				x=in.nextInt();
			}
		}
		System.out.println("You have guessed the correct number");
		runningCount++;
		System.out.println("You have guessed "+runningCount+" times"); 
	}
}