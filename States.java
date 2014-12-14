import java.util.Scanner;
class States 
{
	public static void main(String[] args) 
	{
		int x;
		String []states = {"Nj","ny","pa","ct","de","va","nc"};
		String []capitals = {"Trenton","albany","harrisburg","Hartford","dover","richmond"};
		String what;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a state capital and i'll match it to a state");
		what=in.nextLine();
		for(x=0;x<capitals.length;++x)
		{
			if(what.equalsIgnoreCase(capitals[x]))
			{
				System.out.println(capitals[x]+" is the capital of "+states[x]);
				x=10;
			}
		}
		if(x!=11)
			System.out.println(what+" not in database");
	}
}
