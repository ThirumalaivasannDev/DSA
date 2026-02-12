import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class PrintDivisors
{
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int num=scan.nextInt();
      optimizedDivisors(num);
  }
  static void divisors(int num)
  {
    for (int i = 1; i <=num; i++) {
      if(num%i==0)
      System.err.println(i);
        
    }
  }
  static void optimizedDivisors(int num)
  {

    List<Integer> list=new ArrayList<>();
    for(int i=1;i<=(int)Math.sqrt(num);i++)
    {
      if(num%i==0)
      {
        list.add(i);
        if(num/i!=i)
        {
          list.add(num/i);
        }
      }
    }
    System.err.println(list);
    Collections.sort(list);
    System.err.println(list);
  }
}