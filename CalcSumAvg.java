class CalcSumAvg 
{
	private static int sum = 0;
	private static double avg = 0;
	private static int numTests = 0;
	private String student;

public CalcSumAvg()
	{
	sum = 0;
	avg = 0;
	student = "Not Registered";
	}
public CalcSumAvg(String s)
	{
	sum = 0;
	avg = 0;
	student = s;
	}
public void addSum(int t)
	{
	sum = sum+t;
	++numTests;
	}
public int getSum()
	{
	return(sum);
	}
public double getAvg()
	{
	avg=(double) sum/numTests;
	return avg;
	}
public void setStudentname(String n)
	{
	student = n;
	}
public String getStudentname()
	{
	return student;
	}
}
