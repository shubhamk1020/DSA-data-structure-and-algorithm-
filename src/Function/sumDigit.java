package Function;

import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        System.out.println("sum of these number : " +sumDigit(num));
    }
    public static int sumDigit(int number){
        int sum = 0;
        while (number > 0){
        int remainder = number % 10;
        sum = sum + remainder;
        number = number /10;
    }
        return sum;
}
}
