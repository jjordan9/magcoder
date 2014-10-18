import java.util.Scanner;
import java.text.*; //used for rounding
class Product 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		double first;
		double second;
		double product;
		int num;
		System.out.print("Enter first value here: ");
		first = in.nextDouble();
		System.out.print("Enter second value here: ");
		second = in.nextDouble();
		DecimalFormat twoDForm = new DecimalFormat("#.##");//round variable
		product = (int)((first * second)*100)/100.0;
		System.out.println("product = "+product);
	    System.out.println("Product = "+twoDForm.format(first*second));//round
	}
}
