import java.util.Scanner;
class Lab4
{
	public static void main(String[] args) 
	{
		char b;
		b=isAbc();
		isNumber(b);
	}
	public static char isAbc()
	{
		Scanner in = new Scanner(System.in);
		char b;
		System.out.println("Enter a letter: ");
		b=in.next().charAt(0);
		return b;
	}
	public static void isNumber(char b)
	{
		if(b=='a'|| b=='b'|| b=='c')
			System.out.println("The corresponding number is 2");
		else if(b=='d'|| b=='e'|| b=='f')
			System.out.println("The corresponding number is 3");
		else if(b=='g'|| b=='h'|| b=='i')
			System.out.println("The corresponding number is 4");
		else if(b=='j'|| b=='k'|| b=='l')
			System.out.println("The corresponding number is 5");
		else if(b=='m'|| b=='n'|| b=='o')
			System.out.println("The corresponding number is 6");
		else if(b=='p'|| b=='q'|| b=='r'|| b=='s')
			System.out.println("The corresponding number is 7");
		else if(b=='t'|| b=='u'|| b=='v')
			System.out.println("The corresponding number is 8");
		else if(b=='w'|| b=='x'|| b=='y'|| b=='z')
			System.out.println("The corresponding number is 9");								
		else
			System.out.println(b+" Is an invalid input");
	
	}
}
//==================================	
//Enter a letter:
//g
//The corresponding number is 4
//==================================
//Enter a letter:
//!
//! Is an invalid input