import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeSort {
  
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
   
    //Calling MergeSort Algorithm
    mergeSort(array,0,size-1);
    System.out.println("Sorted Array : ");
    for(int i=0;i<size;i++)
    {
      System.out.print(array[i]+"-");
    }
      
  }


  //Merge Sort (Divide and conquer)

  static void mergeSort(int[] array,int low,int high)
  {
    if(low>=high) 
    {
      return;
    }
    int mid=(low+high)/2;
    mergeSort(array,low,mid);
    mergeSort(array,mid+1,high);
    merge(array,low,mid,high);
  }

  //Merge Two Array
  static void merge(int[] array,int low,int mid,int high)
  {
    List<Integer> temp=new ArrayList<>();
    int left=low;
    int right=mid+1;

    while(left<=mid && right<=high)
    {
      if(array[left]<=array[right])
      {
        temp.add(array[left]);
        left++;
      }
      else
      {
        temp.add(array[right]);
        right++;
      }
    }

    while(left<=mid)
    {
      temp.add(array[left]);
      left++;
    }

    while(right<=high)
    {
      temp.add(array[right]);
      right++;
    }

    for(int i=low;i<=high;i++)
    {
      array[i]=temp.get(i-low);
    }
  }

}
