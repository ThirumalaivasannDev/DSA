import java.util.Scanner;

class SelectionSort
{
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
    selectionSort(array);
    System.out.println("Sorted Array : ");
    for(int i=0;i<size;i++)
    {
      System.out.print(array[i]+"-");
    }
      
  }


  //Sorting the array
  static void selectionSort(int[] array)
  {

    for(int i=0;i<= array.length-2 ;i++)
    {
      int min=i;
      for(int j=i;j<=array.length-1;j++)
      {
        if(array[j]<array[min]) min=j;
      }
      swap(i,min,array);
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