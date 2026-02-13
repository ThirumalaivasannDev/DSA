import java.util.Scanner;

class Print1ToN
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    backTracking(num);
      
  }


  static void backTracking(int num )
  {
    if(num<1) return;

    backTracking(num-1);
    System.out.println(num);
  }
}