import java.util.Scanner;

class PrintNameNTimes
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    recursion(1,num);
      
  }

  static void recursion(int i,int num)
  {
    if(i>num) return;
    System.err.println("Thiru");
    recursion(i+1, num);


  }
}