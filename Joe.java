import java.util.Scanner;
class Joe 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int test1;
    	int test2;
		int test3;
        System.out.print("Enter Student name Here: ");
		String name = in.nextLine();
		System.out.println("Enter Student test1: ");
		test1 = in.nextInt();
		System.out.println("Enter Student test2: ");
		test2 = in.nextInt();
		System.out.println("Enter Student test3: ");
		test3 = in.nextInt();
        int avg = (test1+test2+test3)/3;
		System.out.println (avg);
	}
}
