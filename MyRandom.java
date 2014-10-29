import java.util.Random;
class MyRandom 
{
	public static void main(String[] args) 
	{
		Random nums = new Random();
		//int rannum;
		int[] rannum = new int[49];
		int i;
		int num;
		int hold;
		for(i=0;i<10000;i++)
		{
			num=nums.nextInt(48)+1;
			rannum[num]++;
		}
		for(i=0;i<=47;++i)
			System.out.println(i+" "+rannum[i]);
		for(i=0;i<=46;++i)
		{
			if(rannum[i]>rannum[i+1])
			{
				hold=rannum[i];
				rannum[i]=rannum[i+1];
				rannum[i+1]=hold;
				i=-1;
			}
		}
		for(i=0;i<=47;++i)
			System.out.println(i+" "+rannum[i]);
	}
}
