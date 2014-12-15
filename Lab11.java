import java.util.Scanner;
class Lab11
{
  public static String[][] capitals = {
    {"Nevada","Carson City"},
    {"Alaska","Juneau"},
    {"Arizona","Phoenix"}
  };
  public static void ken()
  {
    int i = 0;
    int right = 0;
    int wrong = 0;
		Scanner in = new Scanner(System.in);
    for(i=0;i<capitals.length;i++)
    {
      String state = capitals[i][0];
      String capital = capitals[i][1];

      //or to put another way
      String[] pair = capitals[i]; 
      state = pair[0];
      capital = pair[1];

			System.out.print("What is the state capital of "+state+"?");
			String guess = in.nextLine().toLowerCase();

      if(guess.equals(capital.toLowerCase()))
      {
        right += 1;
        System.out.println("Correct Guess");
      }
      else
      {
        wrong += 1;
        System.out.println("The capital of "+state+" is "+capital+".");
      }
    }
    System.out.println("You got "+right+" right.");
    System.out.println("You got "+wrong+" right.");
  }
	public static void main(String[] args) 
	{
    ken();
    /*
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
    */
	}
}
