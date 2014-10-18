import java.util.Scanner;
class Modulo
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int whole;
		System.out.println("Enter an integer from 0-1000");
	    whole=in.nextInt();
		int ones=whole%10;
		int tens=whole/10%10;
		int hundreds=whole/100%10;
		int thousands=whole/1000;
		System.out.println(ones+tens+hundreds+thousands);
		}
}
