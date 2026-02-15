import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the array size : ");
    int size=scan.nextInt();
    int[] array=new int[size];
    System.out.println("Enter the array elements : ");
    for(int i=0;i<size;i++)
    {
      array[i]=scan.nextInt();
    }
    bubbleSort(array);
    System.out.println("Sorted Array : ");
    for(int i=0;i<size;i++)
    {
      System.out.print(array[i]+"-");
    }
      
  }


  //Sorting the array
  static void bubbleSort(int[] array)
  {
    for(int i=0;i<array.length-1;i++)
    {
      boolean didSwap=false;

      for(int j=0;j<array.length-1-i;j++)
      {
        if(array[j]>array[j+1])
        {
          swap(j,j+1,array);
          didSwap=true;
        }
      }
      if(!didSwap)
      {
        break;
      }
    }
   
  }

  //Swap two elements
  static void swap(int index1,int index2,int[] array)
  {
    int temp=array[index1];
    array[index1]=array[index2];
    array[index2]=temp;
  }
}
