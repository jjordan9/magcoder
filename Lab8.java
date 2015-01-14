import java.util.Arrays;
import java.util.Scanner;
class Lab8 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int[] integer_inputs = new int[100];
    System.out.print("Enter the integers between 1 and 100: ");
    for(int x=0;x<integer_inputs.length;++x)
    {
      int most_recently_read_int = in.nextInt();
   
      if(most_recently_read_int == 0)
        break;

      integer_inputs[x] = most_recently_read_int;
    }
    CountThem(integer_inputs);
  }
  public static void prettyPrint(int compare, int count)
  {
    if(compare <= 0) 
      return;

    if(compare > 100)
      return;

    if(count==1) 
      System.out.println(compare+" occurs "+count+" time"); 
    else
      System.out.println(compare+" occurs "+count+" times"); 
  }
  public static void CountThem(int[] a)
  {
    SortThem(a);
    int count, compare;

    count = 1;
    compare = a[0];

    for(int x=1; x<a.length;++x)
    {
      if(compare == a[x])
      {
        ++count;
      }
      else {
        prettyPrint(compare,count);
        count = 1;
      }
      compare = a[x];
    }
    prettyPrint(compare,count);
  }
  public static void SortThem(int[] a)
  {
    int hold;
    for(int x=0;x<(a.length)-1;++x)
    {
      if(a[x]>a[x+1])
      {
        hold=a[x];
        a[x]=a[x+1];
        a[x+1]=hold;
        x=-1;
      }
    }
  }
}
/*================================================
Enter the integers between 1 and 100: 22 1 1 2 2 2 0
1 occurs 2 times
2 occurs 3 times
22 occurs 1 time*/

