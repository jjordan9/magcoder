import java.lang.Math;
import java.util.Scanner;
class For 
{
	public static void main(String[] args) 
	{
		String me="jeff jordan";
		double y=0;
		double w=0;
		int a=5;
		int b=6;
		int c,x;
		double prin=1500;
		double rate=.075;
		c=a+b;
		System.out.println(" a= "+a+" b= "+b+" c = "+c);
		c=(++a)+(++b);
		System.out.println(" a= "+a+" b= "+b+" c = "+c);
		c=(a++)+(b++);
		System.out.println(" a= "+a+" b= "+b+" c = "+c);
		for(x=0;x<=9;x=x+3)
		{
			System.out.println(me);
		}
		System.out.println(x);
		for(x=0;x<=4;++x)
		{
			prin=prin*(1+rate);

	}
	System.out.println("after "+x+" years the accumulation = $"+prin);

}
}
