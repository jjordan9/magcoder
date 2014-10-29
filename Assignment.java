class Assignment 
{
	public static void main(String[] args)
	{
		String firstName="Jeff";
		String lastName="Jordan";
		int x=0;
		for(x=0;x<15;++x)
		{
			if(x<5)
			{
				System.out.println(firstName);
				System.out.println();
			}
			else if(x<10)
			{
				System.out.println(lastName);
				System.out.println();
			}
			else
				System.out.println(firstName+" "+lastName);
				System.out.println();
		}
	}
}
