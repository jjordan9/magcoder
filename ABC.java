import java.util.Scanner;
class ABC 
{
	static Scanner in = new Scanner(System.in);
	static String Student;
	static int HereOnce=0;
	static int T1=0, T2=0, T3=0;
	public static void main(String[] args)
	{
		int sum;
		double avg;
		System.out.println("Please enter student name here: ");
		Student = in.nextLine();
		sum=GetTests();
		avg=CalcAvg(sum);
		DisplayAvg(avg);
	}
	public static int GetTests()
	{
		int sum=0;
		if(HereOnce == 0)
		{
		HereOnce=1;
		System.out.println("Enter test one grade");
		T1=in.nextInt();
		System.out.println("enter test two grade");
		T2=in.nextInt();
		System.out.println("enter test three grade");
		T3=in.nextInt();
		sum=(T1+T2+T3);
		return(sum);
		}
		else
		{
			System.out.println("Test scores for "+Student+
				"are "+T1+","+T3);	
		return(0);
		}
	}
	public static double CalcAvg(int sum)
	{
		double avg;
		avg=(double)sum/3;
		return avg;
	}
	public static void DisplayAvg(double avg)
	{
		int hold;
		hold=GetTests();
		if(avg>=90)
			System.out.println(Student+" has an A average");
		else
			if(avg>=80)
			System.out.println(Student+" has a B average");
		else
			if(avg>=70)
			System.out.println(Student+" has a C average");
		else
			if(avg>=65)
			System.out.println(Student+" has a D average");
		else
			System.out.println(Student+" has failed miserably");

	}
}
