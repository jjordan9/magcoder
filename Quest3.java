class Quest3 
{
	public static void main (String[]args)
	{
		int x;
		int runningSum=0;
		int runningCount=0;
		for(x=1;x<=99;x++)
		{
			if(isOdd(x))
			{
				runningSum=runningSum+x;
				runningCount=runningCount+1;
			}
		}	
				System.out.println(runningSum/runningCount);
	
	}
	public static boolean isOdd(int x)
	{
		return(x%2!=0);

	}

}