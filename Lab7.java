import java.lang.Character;
import java.util.Scanner;
class Lab7
{
	public static void main(String[] args) 
	{
		int x;
		String a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a 1800 number");
		a= in.nextLine();
		//a.toLowerCase();
		b.toLowerCase(a);
		//char ch = a.CharAt(x);
		for(x=0;x<a.length;++x)
		{
			char ch = b[x];
			if((ch == 'a') || (ch == 'b') || (ch == 'c'))
				{
					ch = 2;	
				}		
				else if((ch =='d') || (ch =='e') || (ch =='f'))
				{
					ch = 3;
				}
				else if((ch =='g') || (ch =='h') || (ch =='i'))
				{
					ch = 4;
				}
				else if((ch =='j') || (ch =='k') || (ch =='l'))
				{
					ch = 5;
				}
				else if((ch =='m') || (ch =='n') || (ch =='o'))
				{
					ch = 6;
				}
				else if((ch =='p') || (ch =='q') || (ch =='r') || (ch =='s'))
				{	
					ch = 7;	
				}
				else if((ch =='t') || (ch =='u') || (ch =='v'))
				{
					ch = 8;
				}
				else if((ch =='w') || (ch =='x') || (ch =='y') || (ch =='z'))
				{
					ch = 9;
				}
		}
		System.out.println(ch);
	}
}
			
