class Loops
{
  public static void main(String[] args)
  {
    whileLoopExample();
    //forLoopExample();
  }
  public static void whileLoopExample()
  {
    System.out.println("whileLoopExample.. lets watch i!");
    int i = 0;
    //System.out.println("(start) int i is:"+i+", and boolean b is:"+(i != 10)+".");

    while (i != 10)
    {
      //System.out.println("(in loop) int i is:"+i+", and boolean b is:"+(i != 10)+".");
      i++;
    }

    System.out.println("(end) int i is:"+i+", and boolean b is:"+(i != 10)+".");

    System.out.println("finished whileLoopExample.");
  }
  public static void whileLoopChallenge1()
  {
    // Produce and print the sum of all numbers between 1 and 10
    // Your output of the program should be one line:
    // The sum of the numbers between 1 and 10 is X
    // (where x is the sum)
  }

  public static void forLoopExample()
  {
    System.out.println("forLoopExample.. lets watch i!");
    // for(expr1; expr2; expr3)
    // expr1 - initial expression
    for(int i = 0; i != 10; i++)
    {
      System.out.println("my super cool variable i is: "+i+".");
    }
    System.out.println("finished forLoopExample.");
  }
  public static void plusPlusExample1()
  {
    System.out.println("entering plusPlusExample1()");

    int y, z, e, f, b;
    int x = 0;
    y = z = x++;
    e = f = b = ++x;
    System.out.println("x is "+x);

    System.out.println("exiting plusPlusExample1()");
  }
  public static void plusPlusExample2()
  {
    System.out.println("entering plusPlusExample2()");
    int x = 0;
    int y = x++; //y = x; x = x + 1; UNDERSTAND THIS
    printXandY(x,y);

    x = 0;
    y = ++x; // x = x + 1; y = x; UNDERSTAND THIS
    printXandY(x,y);
    System.out.println("exiting plusPlusExample2()");
  }
  public static void printXandY(int x, int y)
  {
    System.out.println("x is "+x);
    System.out.println("y is "+y);
  }
}
