class Challenge4
{
	public static void main(String[] args)
	{	
		whileLoopChallenge4();
	}
	public static void whileLoopChallenge4()
	{
		int x=1;
		int runningCount=0;
		while(x<100)
		{
			if(isPrime(x))
			{
				runningCount=runningCount+1;
			}
			x++;
		}
		System.out.println("there are "+runningCount+" prime numbers less than 100.");
	}
	
	//checks whether an int is prime or not.

	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
/*
	public static boolean isPrimeJeff(int x) 
	{
		if(isEven(x))
		{
			if(x == 2)
			{
				return true;
			} else {
				return false;
			}
		} else { // x is odd
			for(int i=3;i*i<=n;i+=2)
				{
					if(n%i==0)
		
			return x; 
		}
	}
	*/
}
		
	 

	
	