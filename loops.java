class Loops
{
	public static void main(String[] args)
	{
    //whileLoopExample();
    //forLoopExample();
	whileLoopChallenge1();
	whileLoopChallenge2();
	whileLoopChallenge3();
	forLoop1();
	//for(int i = 0; i!= 100; i++)
	//  {
	//		System.out.println("i is :"+i+", and isEven("+i+") is "+isEven(i)+".");
	//  }
 // }
  /*public static void whileLoopExample()
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

    System.out.println("finished whileLoopExample.");*/
	}
	public static boolean isEven(int x)
	{
	  // this should return true if x is even
	  // false if x is odd
	  // implement this
	return(x%2==0);
	}
	public static void whileLoopChallenge2()
	{
    //sum of even int between 1-10
	int x=1;
	int runningSum = 0;
	while(x<=10)
	{
		if(isEven(x))
		{
			runningSum=runningSum+x;
		}
		x++;
	}
	System.out.println(runningSum);
	}
	public static boolean isOdd(int x)
	{
		return(x%2!=0);
	}
	public static void whileLoopChallenge3()
	{
		int x=1;
		int runningSum=0;
		while(x<=10)
		{
			if(isOdd(x))
			{
				runningSum=runningSum+x;
			}
			x++;
		}
			System.out.println(runningSum);
	}
	public static void whileLoopChallenge1()
	{
		int x=1;
		int runningSum=0;
		while(x<=10)
		{
			runningSum=runningSum+x;
			x++;
		}
		System.out.println(runningSum);
	}
	public static void forLoop1()
	{
		int x=0;
		int runningSum=1;
		while(x%2!=0)
		{
			for(x=3;x<=9;x+=2)
			{
				if(x*x%20)
				{
					runningSum=runningSum+1;
				}
			
			}
		}
		System.out.println(runningSum);
	}
		
}
	
		
	
			
	

	
 /* public static void forLoopExample()
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
}*/
