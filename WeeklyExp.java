import java.util.Scanner;
class WeeklyExp
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		double exp[][] = new double[6][6];
		String[] days = {"Mon","Tues","Wed","Thurs","Fri","ToT"};
		String[] exps = {"Gas  ","Food ","Tolls","Miles","Misc ","ToT  "};
		LoadArray(exp,days,exps);
		ShowArray(exp,days,exps);
	}
	public static void LoadArray(double exp[][],String days[],String exps[])
	{
		int row,col;
		for(row=0;row<=4;++row)
		{
			for(col=0;col<=4;++col)
			{
				System.out.print("Enter a value for "+exps[col]
					+"for "+days[row]+" Here: "); 
				exp[row][col]=in.nextDouble();
				exp[5][5]=exp[row][col]+exp[5][5];
				exp[row][5]=exp[row][col]+exp[row][5];
				exp[5][col]=exp[row][col]+exp[5][col];
			}
		}
	}
	public static void ShowArray(double exp[][],String days[],String exps[])
	{
		int row,col;
		for(row=0;row<=5;++row)
		{
			System.out.print("   "+days[row]);
		}
		System.out.println();
		System.out.println("===================================");
		for(row=0;row<=5;++row)
		{
			System.out.print(exps[row]+"  ");
			for(col=0;col<=5;++col)
			{
				System.out.print(exp[row][col]+"  ");
			}
			System.out.println();
		}
	}
}
