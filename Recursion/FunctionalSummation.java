import java.util.Scanner;

class FunctionalSummation
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    System.out.println(summation(num));
      
  }

  static int summation(int num)
  {
    
    if(num==1) return 1;

    return num+summation(num-1);
  }
}