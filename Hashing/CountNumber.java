import java.util.Scanner;

class CountNumber
{
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter Size:");
      int size=scan.nextInt();
      int[] array=new int[size];
      System.out.println("Enter elements : ");
      for(int i=0;i<size;i++)
      {
        array[i]=scan.nextInt();
      }

      //Precomputing

      int[] hash=new int[13];
      for(int i=0;i<size;i++)
      {
        hash[array[i]]++;
      }
      System.out.println("Enter the query Count : ");
      int queryCount=scan.nextInt();

      while(queryCount!=0)
      {
        queryCount--;
        System.err.println("Enter Query : ");
        int query=scan.nextInt();

        //fetch
        System.out.println(hash[query]);
      }

  }
}