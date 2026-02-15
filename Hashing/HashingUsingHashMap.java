import java.util.HashMap;
import java.util.Scanner;

public class HashingUsingHashMap {
  
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.err.println("Enter the size of the Array : ");
      int size=scan.nextInt();
      System.err.println("Enter the array Elements : ");
      int[] array=new int[size];
      for(int i=0;i<size;i++)
      {
        array[i]=scan.nextInt();
      }







          //pre computing
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<size;i++)
            {
              int key=array[i];
              int freq=0;

              if(map.containsKey(key))
              {
                freq=map.get(key);
              }

              freq++;
              map.put(key,freq);
            }


          map.forEach((key,value)->
        {
          System.err.println(key + "---" +value);
        });














        System.err.println("Enter the query Count : ");
        int count=scan.nextInt();

        while(count!=0)
        {
          System.err.println("Enter the query");
          int query=scan.nextInt();
          count--;

          //fetching
          if(map.containsKey(query))
          {
            System.err.println( map.get(query) );
          }
          else
          {
            System.err.println("0");
          }
        }
      }
}
