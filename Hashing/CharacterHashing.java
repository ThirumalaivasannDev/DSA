import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.err.println("Enter the Word");
        String word=scan.next();
        

        //Pre Computing

        int[] hash=new int[256];
        for(int i=0;i<word.length();i++)
        {
          hash[word.charAt(i)]++;
  
        }

        System.out.println("Enter the Query count : ");
        int queries=scan.nextInt();

        while(queries!=0)
        {
          System.out.println("Enter the query : ");
          char query=scan.next().charAt(0);

          System.out.println(hash[query]);
          queries--;
        }
    }
}
