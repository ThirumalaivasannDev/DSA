
import java.util.Scanner;

class ExtractionOfDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        int lastDigit=0;
        while(num>0)
        {
          lastDigit=num%10;
          System.err.println(lastDigit);
          num/=10;
        }
    }
}
