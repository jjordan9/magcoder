import java.util.Random;
class MyRandom 
{
	public static void main(String[] args) 
	{
		Random nums = new Random();
		int rannum;
		//int[] rannum = new int[10];
		int i;
		for(i=0;i<10000;i++)
		{
			rannum=nums.nextInt(48)+1;
			System.out.println(rannum);
		}


		
	}
}
