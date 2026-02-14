import java.util.Scanner;
class Fibonacci
{
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int num=scan.nextInt();
      System.out.println(fib(num));
  }

  static int fib(int num)
  {
    if(num<=1) return num;

    return fib(num-1) + fib(num-2);
  }
}