import java.util.Scanner;
class ReverseaNumber
{
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int num=scan.nextInt();
      int org=num;
      int revNum=0;
      int lastDigit=0;
      while(num>0)
      {
        lastDigit=num%10;
        revNum=(revNum*10)+lastDigit;
        num/=10;
      }
      System.err.println(org==revNum);
  }
}