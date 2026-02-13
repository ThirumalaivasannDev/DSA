import java.util.Scanner;

class ParametarisedSummation
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    summation(num,0);
      
  }

  static void summation(int num,int sum)
  {
    if(num<1)
    {
      System.out.println(sum);
      return;
    }

    summation(num-1,sum+num);
  }
}