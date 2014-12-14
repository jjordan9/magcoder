import java.util.Scanner;
class Comp171 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int grades[] = new int[5];
		int x;
		double avg;
		String studentName;
		CalcSumAvg section01 = new CalcSumAvg();
		for(x=0;x<=4;++x)
		{
			System.out.println("Enter grade here: ");
			grades[x]=in.nextInt();
			sections01.addSum(grades[x]);
		}
		avg=sections01.getAvg();
		System.out.print("enter a student name");
		studentName=in.next();
		student=section01.getStudentname();
		System.out.println("average for "+studentName+" is "+avg);
	}
}
