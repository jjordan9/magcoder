class Times 
{
	public static void main(String[] args) 
	{
		int x,y;
		for(x=2;x<=4;++x)
		{
			System.out.println(x+" Times Tables");
			System.out.println("===================");
			for(y=2;y<=12;++y)
			{
				System.out.println(x+"*"+y+"="+x*y);
				System.out.println();
			}
		}
		
	}
}
