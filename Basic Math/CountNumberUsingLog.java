import java.util.Scanner;

class CountNumberUsingLog
{
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int num=scan.nextInt();

      int digit=(int)(Math.log10(num)+1);
      System.err.println(digit);
  }
}