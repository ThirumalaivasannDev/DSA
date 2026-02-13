import java.util.Scanner;

class EuclidienAlgorithm
{
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int num1=scan.nextInt();
      int num2=scan.nextInt();

      while(num1>0&&num2>0)
      {
        if(num1>num2) num1=num1%num2;
        else num2=num2%num1;
      }

      if(num1==0)
      {
        System.err.println(num2);
      }
      else
      {
        System.err.println(num1);
      }
  }
}