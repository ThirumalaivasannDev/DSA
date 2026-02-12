
import java.util.Scanner;

class ExtractionOfDigits {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int org=num;
        int sum=0;
        int lastDigit=0;
        while(num>0)
        {
          lastDigit=num%10;
          sum=sum+(lastDigit*lastDigit*lastDigit);
          num/=10;
        }
        System.err.println(sum);
        System.err.println(sum==org);
    }
}
