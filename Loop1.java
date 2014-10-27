class Loop1 
{
	public static void main(String[] args) 
	{
		int x;
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
		}
	}
			
}
