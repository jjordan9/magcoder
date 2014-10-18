import javax.swing.JOptionPane;
class J
{
	public static void main(String[] args) 
	{
		String in;
		in=JOptionPane.showInputDialog
			("Enter first student name here ");
		System.out.println(name1);
		in=JOptionPane.showInputDialog("Enter your age:");
		int age = Integer.parseInt(in);
		System.out.println(age);
		JOptionPane.showMessageDialog
			(null,"Thank you, "+name1+" is the first student on the list and is "+age+" years old");

	}
}
