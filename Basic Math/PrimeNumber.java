import java.util.Scanner;

class PrimeNumber
{
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int num=scan.nextInt();
      int count=0;
      for(int i=1;i*i<=num;i++)
      {
        if(num%i==0)
        {
          count++;
          if(num/i!=i)
          {
            count++;
          }
        }
      }

      System.err.println(count==2);
  }
}