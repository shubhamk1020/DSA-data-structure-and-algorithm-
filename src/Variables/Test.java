package Variables;

import java.util.Scanner;

// In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.

public class Test {
    public static void main(String[] args) {
        int a,b,c, avg;

        System.out.print("Enter first Value: " );
        Scanner sc = new Scanner(System.in);
       a= sc.nextInt();
        System.out.print("Enter second Value: " );
       b= sc.nextInt();
        System.out.print("Enter third Value: " );
       c= sc.nextInt();

       avg = (a+b+c)/3;
        System.out.println("Avg is :"  +avg);
    }
}

// answer -->>>
//    Enter first Value: 3
//        Enter second Value: 9
//        Enter third Value: 56
//        Avg is :22
