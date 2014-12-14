import java.util.Scanner;
class Lab8 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int[] integer_inputs = new int[100];

    System.out.println("** This is poor english. A clearer instruction to the user would read: **");
    System.out.println("** Enter a list of integers between 1 and 100 separated by spaces and terminated by a 0.");
    System.out.println("** Note that "+integer_inputs.length+" is the maximum number of integers you can input.");
    System.out.println("** eg: 1 5 0");
    System.out.print("Enter the integers between 1 and 100: ");

    // this loop is not appropriate for our goals
    // specifically because it always goes up to the size of the input array
    // that is the max size, and has nothing to do with how many the user ACTUALLY entered
    // we want to keep reading integers until we read a ZERO
    for(int x=0;x<integer_inputs.length;++x)
    {
      int most_recently_read_int = in.nextInt();
      System.out.println("[DEBUG] i just read this integer from the list: ["+most_recently_read_int+"]");

      if(most_recently_read_int == 0)
        break;

      integer_inputs[x] = most_recently_read_int;
    }
    CountThem(integer_inputs);
  }
  public static void CountThem(int[] a)
  {
    SortThem(a);
    int count, compare;
    count = 1;
    compare = a[0];
    for(int x=1;x<a.length;++x)
    {
      if(compare == a[x])
        ++count;
      else if(count==1)
      {
        System.out.println(compare+" occurs "+count+" time");
        compare=a[x];
        count=1;
      }
      else
      {
        System.out.println(compare+" occurs "+count+" times");
        compare=a[x];
        count=1;
      }
    }

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
