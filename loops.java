class Loops
{
  public static void main(String[] args)
  {
    forLoopExample();
  }
  public static void whleLoopExample()
  {
    // I'm showing Jeff cool shit
	int x = 0;
  }
  public static void forLoopExample()
  {
    System.out.println("forLoopExample.. lets watch i!");
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
