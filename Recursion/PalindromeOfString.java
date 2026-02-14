import java.util.Scanner;

class PalindromeOfString
{
  public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      String word=scan.next();
      System.err.println( checkPalindrome(word, 0, word.length()) );
  }

  static boolean checkPalindrome(String word,int index,int size)
  {
    if(index>=size/2) return true;
    if( word.charAt(index)!=word.charAt(size-index-1) ) return false;

    return checkPalindrome(word, index+1, size);
    
  }
}