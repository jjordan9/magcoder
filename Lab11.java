import java.util.Scanner;
class Lab11
{
	public static void main(String[] args) 
	{
		int x;
		String[]states = {"Nevada","Alaska","Arizona","Denver","New Jersey","New York",
							"Pennsylvania","Connecticut","Delaware","Virginia"};
		String[]capitals = {"Carson City","Juneau","Phoenix","Denver","Trenton","Albany",
							"Harrisburg","Hartford","Dover","Richmond"};
		Scanner in = new Scanner(System.in);
		String a;
		for(x=0;x<states.length;++x)
		{
			System.out.print("What is the state capital of "+states[x]+"?");
			a=in.nextLine();
			if(a==capitals[x])
			{
				System.out.println("Your answer is correct");
			}
			else
			{
				System.out.println("The correct answer should be "+capitals[x]);
			}
		}
	}
}
