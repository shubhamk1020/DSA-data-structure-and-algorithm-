package Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 1;
        for(int i=2; i<=n; i++){

            System.out.println(res + " * " + i);
            res = res*i;

        }
        System.out.print("Factorial of " + n +" is: "+res);
    }
}

// answer -->>>
//Enter any number :
//4
//1 * 2
//2 * 3
//6 * 4
//Factorial of 4 is: 24
