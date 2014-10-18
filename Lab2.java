import javax.swing.JOptionPane;
import java.text.*;
import java.lang.Math;
class Lab2 
{
	public static void main(String[] args) 
	{
		String in;
		double inv, rate, years, future, power, mult;
		DecimalFormat twoDForm = new DecimalFormat("#.##");
		in=JOptionPane.showInputDialog("What will be your original investment?");
		inv=Double.parseDouble(in);
		System.out.println("Your starting investment is "+"$"+inv);
		in=JOptionPane.showInputDialog("What will your interest rate be?");
		rate=Double.parseDouble(in);
		System.out.println("Your interest rate is "+rate+"%");
		in=JOptionPane.showInputDialog("How many years will this investment be for?");
		years=Double.parseDouble(in);
		System.out.println("Your investment will be for "+years+" years");
		mult=rate/100+1;
		power=Math.pow(mult, years);
		future=inv*power;
		System.out.println
			("Your accumulated value will be "+"$"+twoDForm.format(future));
		JOptionPane.showMessageDialog
			(null, "Your accumulated value will be " + "$"
		    +twoDForm.format(future),"Investment Conclusion",
				JOptionPane.INFORMATION_MESSAGE);
		}
}
//==========================================================================
/*Your starting investment is $1245.0
Your interest rate is 6.75%
Your investment will be for 7.0 years
Your accumulated value will be $1966.73*/

 