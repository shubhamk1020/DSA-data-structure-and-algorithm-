package Function;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a palindrome number ");
        int num = sc.nextInt();

        if (isPalindrome(num)){
            System.out.println("Number : " +num + " is a palindrome no. "  );
        } else{
        System.out.println("Number : " +num + " is a not a  palindrome no. "  );
    }

    }

    public static boolean isPalindrome(int number) {
        int palindromee = number;
        int reverse = 0;
        while (palindromee != 0) {
            int remainder = palindromee % 10;
            reverse = reverse * 10 + remainder;
            palindromee = palindromee / 10;

        }
    if(number == reverse){
        return true;
    }
    return false;
    }

}
