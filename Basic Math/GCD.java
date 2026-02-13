import static java.lang.Math.*;
import java.util.Scanner;

class GCD
{
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int num1=scan.nextInt();
      int num2=scan.nextInt();

      int gcd=0;

      for(int i=min(num1,num2);i>=1;i--)
      {
        if(num1%i==0 && num2%i==0)
        {
          gcd=i;
          break;
        }
      }
      System.err.println(gcd);
  }
}