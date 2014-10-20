import java.util.Scanner;
class Lab4
{
	public static void main(String[] args) 
	{
		char b=0;
		b=isAbc();
		isTwo(b);
		isThree(b);
		isFour(b);
		isFive(b);
		isSix(b);
		isSeven(b);
		isEight(b);
		isNine(b);
		isInvalid(b);
	}
	public static char isAbc()
	{
		Scanner in = new Scanner(System.in);
		char b=0;
		System.out.println("Enter a letter: ");
		b=in.next().charAt(0);
		return b;
	}
	public static void isTwo(char b)
	{
		if((b=='a')||(b=='b')||(b=='c'))
			System.out.println("The corresponding number is 2");
	}
	public static void isThree(char b)
	{
		if((b=='d')||(b=='e')||(b=='f'))
			System.out.println("The corresponding number is 3");
	}
	public static void isFour(char b)
	{
		if((b=='g')||(b=='h')||(b=='i'))
			System.out.println("The corresponding number is 4");
	}
	public static void isFive(char b)
	{
		if((b=='j')||(b=='k')||(b=='l'))
			System.out.println("The corresponding number is 5");
	}
	public static void isSix(char b)
	{
		if((b=='m')||(b=='n')||(b=='o'))
			System.out.println("The corresponding number is 6");
	}
	public static void isSeven(char b)
	{
		if((b=='p')||(b=='q')||(b=='r')||(b=='s'))
			System.out.println("The corresponding number is 7");
	}
	public static void isEight(char b)
	{
		if((b=='t')||(b=='u')||(b=='v'))
			System.out.println("The corresponding number is 8");
	}
	public static void isNine(char b)
	{
		if((b=='w')||(b=='x')||(b=='y')||(b=='z'))
			System.out.println("The corresponding number is 9");
	}
	public static void isInvalid(char b)
	{								
		if((b!='a')&&(b!='b')&&(b!='c')&&(b!='d')&&(b!='e')&&(b!='f')
			&&(b!='g')&&(b!='h')&&(b!='i')&&(b!='j')&&(b!='k')&&
			(b!='l')&&(b!='m')&&(b!='n')&&(b!='o')&&(b!='p')&&(b!='q')
			&&(b!='r')&&(b!='s')&&(b!='t')&&(b!='u')&&(b!='v')&&
			(b!='w')&&(b!='x')&&(b!='y')&&(b!='z'))
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