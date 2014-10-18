import javax.swing.JOptionPane;
class InandOut
{
	public static void main(String [] args)
	{
		String in, name1;
		int num1, num2;
		JOptionPane.showMessageDialog
			(null,"Here We Are in Jim's COMP-171 Tuesday Afternoon...Ah");
		//System.out.println("Here We Are in Jim's COMP-171 Tuesday Afternoon...Ah");
		in=JOptionPane.showInputDialog
			("Enter First Number Here ");
		//System.out.println(in);
		num1=Integer.parseInt(in);
		in=JOptionPane.showInputDialog
			("Enter Second Number Here ");
		//System.out.println(in);
		num2=Integer.parseInt(in);
		name1=JOptionPane.showInputDialog
			("oh yea wats your name");
		//System.out.println(name1);
		int num3=num1+num2;
		JOptionPane.showMessageDialog
			(null,"The Sum is "+(num3)+ " thanks "+name1);
		//System.out.println("The sum is " + (num3) + " thanks " + name1);

	}
}
