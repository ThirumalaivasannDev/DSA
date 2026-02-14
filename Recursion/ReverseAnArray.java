import java.util.Scanner;

class ReverseAnArray
{ 
  public static void main(String[] args) {
    
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    int[] array=new int[n];
    for(int i=0;i<n;i++)
    {
      array[i]=scan.nextInt();
    }
    int left=0;
    int right=n-1;
    for(int i:array) System.out.print(i+" ");

    reverse(left, right, array);
    System.err.println();

    for(int i:array) System.out.print(i+" ");

  }

  static void reverse(int left,int right,int[] array)
  {
    if(left>right) return;

    swap(left,right,array);
    reverse(left+1,right-1,array);
  }
  static void swap(int index1,int index2,int[] array)
  {
    int temp=array[index1];
    array[index1]=array[index2];
    array[index2]=temp;
  }
}