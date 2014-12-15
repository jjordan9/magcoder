import java.lang.Character;
import java.util.Scanner;
class Lab7
{
  // This method only takes letters
  // don't be dumb and send it special characters or numbers
  // bad idea
  public static char getNumber(char character)
  {
    char ch = Character.toUpperCase(character);
    if((ch == 'A') || (ch == 'B') || (ch == 'C'))
      {
        ch = '2';	
      }		
      else if((ch =='D') || (ch =='E') || (ch =='F'))
      {
        ch = '3';
      }
      else if((ch =='G') || (ch =='H') || (ch =='I'))
      {
        ch = '4';
      }
      else if((ch =='J') || (ch =='K') || (ch =='L'))
      {
        ch = '5';
      }
      else if((ch =='M') || (ch =='N') || (ch =='O'))
      {
        ch = '6';
      }
      else if((ch =='P') || (ch =='Q') || (ch =='R') || (ch =='S'))
      {	
        ch = '7';	
      }
      else if((ch =='T') || (ch =='U') || (ch =='V'))
      {
        ch = '8';
      }
      else if((ch =='W') || (ch =='X') || (ch =='Y') || (ch =='Z'))
      {
        ch = '9';
      }
      return ch;
  }
	public static void main(String[] args) 
	{
		int x;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String a = in.nextLine();
    String translated_string = "";

		for(x=0;x<a.length();++x)
    {
      char character = a.charAt(x);

      if(Character.isLetter(character))
        character = getNumber(character);

      translated_string = translated_string + character;
    }
    System.out.println(translated_string);
	}
}
			
