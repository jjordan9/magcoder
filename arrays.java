class arrays 
{
	public static void main(String[] args) 
	{
		int [] nums = {10, 20, 30};
		String hi = "Hey";
		for(int i=0; i< nums.length; i++)
		{
			System.out.println(nums[i]);
		}
		printArray(nums);
		for(int i=0; i < nums.length; i++)
		{
			System.out.println(nums[i]+" ");
		}
	}
	public static void printArray(int [] n)
	{
		n[0] = 22;
	}
	public static void printBackwards(int []x)
	{
		for(int i= x.length-1; i>=0; i--)
		{
			System.out.print(x[i]);
		}
	}
}
