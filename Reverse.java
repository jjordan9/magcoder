import java.util.Scanner;
class Reverse 
{
	public static void main(String[] args) 
	{
		int array[] = new int[5];
		int size=array.length;
		LoadArray(array);
		Revarray(array,size);
	}
	public static void LoadArray(int a[])
	{
		Scanner in = new Scanner(System.in);
		for(int x=0;x<=4;++x)
		{
			System.out.print("Enter value #"+(x+1)+" here: ");
			a[x]=in.nextInt();
		}
	}
	public static void Revarray(int a[],int size)
	{
		System.out.println("In reverse order");
		--size;
		for(int x=size;x>=0;--x)
		{
			System.out.print(a[x]+" ");
		}
	}
}
