import java.util.Scanner;

class PrintNameNTimes
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    
    recursion(num);
  }
  static void recursion(int num)
  {
    
    if(num<1) return;

    System.err.println(num);
    num--;
    recursion(num);

  }
}