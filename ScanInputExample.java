import java.util.Scanner;
public class ScanInputExample 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("System is ready to accept input, please enter a name");
		String name = in.nextLine();
		System.out.println("Hi " + name + ", Can you enter an int number");
		int number = in.nextInt();
		System.out.println("You have entered : " + number);
		System.out.println("Thank you");
	}
}
