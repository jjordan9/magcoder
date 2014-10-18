import java.util.Calendar;
import java.util.Scanner;
class Person
{
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Calendar now = Calendar.getInstance();
		String Id;
		int age,BirthYear;
		int CurrYear = now.get(Calendar.YEAR);
		Id=GetId();
		System.out.println("Hello there "+Id);
		age=GetAge(Id);
		System.out.println(Id+" is "+age+" years old");
		BirthYear=CalcBirthYear(CurrYear,age);
		System.out.println(Id+" Was Born in "+BirthYear);
	}
	public static int CalcBirthYear(int CurrYear, int age)
	{
		int BirthYear;
		BirthYear=CurrYear-age;
		return(BirthYear);
	}
	public static String GetId()
	{
		String Id;
		System.out.print("ENTER NAME HERE:" );
		Id=in.nextLine();
		return(Id);
	}
	public static int GetAge(String Id)
	{
		int agein;
		System.out.print(Id+" How old are you? ");
		agein=in.nextInt();
		return agein;
	}

}
		
