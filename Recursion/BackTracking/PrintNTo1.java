import java.util.Scanner;

class Print1ToN
{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int num=scan.nextInt();
    backTracking(1,num);
      
  }


  static void backTracking(int i,int num )
  {
    if(i>num) return;

    backTracking(i+1,num);
    System.out.println(i);
  }
}