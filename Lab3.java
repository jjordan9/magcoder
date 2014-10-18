import java.util.Scanner;
class Lab3
{
	public static void main(String[] args) 
	{
		int month, year;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the year: ");
		year=in.nextInt();
		System.out.println("Enter the month(number): ");
		month=in.nextInt();
		int rem=year%4;
		if(month==1)
		{
			System.out.println("January "+year+" has 31 days");
		}
		else
		{
		if((rem!=0)&&(month==2))
		{
			System.out.println("February "+year+" has 28 days");
		}
		else
		{
		if((rem==0)&&(month==2))
		{
			System.out.println("February "+year+" has 29 days");
		}
		else
		{
		if(month==5)
		{
			System.out.println("May "+year+" has 31 days");
		}
		else
		{
		if(month==6)
		{
			System.out.println("June "+year+" has 30 days");
		}
		else
		{
		if(month==7)
		{
			System.out.println("July "+year+" has 31 days");
		}
		else
		{
		if(month==8)
		{
			System.out.println("August "+year+" has 31 days");
		}
		else
		{
		if(month==9)
		{
			System.out.println("September "+year+" has 30 days");
		}
		else
		{
		if(month==10)
		{
			System.out.println("October "+year+" has 31 days");
		}
		else
		{
		if(month==11)
		{
			System.out.println("November "+year+" has 30 days");
		}
		else
		{
		if(month==12)
		{
			System.out.println("December "+year+" has 31 days");
		}
		}}}
		}
		}
		}}}}}}}
//================================================================
/*Enter the year:
2016
What month is it:
2
February 2016 has 29 days*/

	
	
		