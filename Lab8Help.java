import java.util.Arrays;
import java.util.Scanner;
class Lab8Help 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int[] integer_inputs = new int[100];

   // System.out.println("** This is poor english. A clearer instruction to the user would read: **");
    //System.out.println("** Enter a list of integers between 1 and 100 separated by spaces and terminated by a 0.");
    //System.out.println("** Note that "+integer_inputs.length+" is the maximum number of integers you can input.");
    //System.out.println("** eg: 1 5 0");
    System.out.print("Enter the integers between 1 and 100: ");

    // this loop is not appropriate for our goals
    // specifically because it always goes up to the size of the input array
    // that is the max size, and has nothing to do with how many the user ACTUALLY entered
    // we want to keep reading integers until we read a ZERO
    for(int x=0;x<integer_inputs.length;++x)
    {
      int most_recently_read_int = in.nextInt();
     // System.out.println("[DEBUG] i just read this integer from the list: ["+most_recently_read_int+"]");

      if(most_recently_read_int == 0)
        break;

      integer_inputs[x] = most_recently_read_int;
    }
    CountThem(integer_inputs);
  }
  public static void prettyPrint(int compare, int count)
  {
    if(compare <= 0) // we don't want to print about 0's
      return;

    if(compare > 100)
      return;

    if(count==1) // time(s)
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
    //System.out.println("[DEBUG] Here is the array before sorting:");
    // System.out.println(a); // poor way to print an array, prints the object id instead of the contents
    // System.out.println(a.toString()); // poor way to print an array, prints the object id instead of the contents
    //System.out.println(Arrays.toString(a)); // yahtzee!!
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
    //System.out.println("[DEBUG] Here is the array after sorting:");
    //System.out.println(Arrays.toString(a)); // yahtzee!!
  }

}
