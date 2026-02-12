import java.util.Scanner;

class CountingNumberOfDigits
{
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int num=scan.nextInt();

      int count=0;
      while(num>0)
      {
        count++;
        num/=10;
      }
      System.err.println(count);
  }
}