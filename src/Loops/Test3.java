package Loops;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Enter the table number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<=10; i++){
            int result = n*i;
            System.out.println(n +" * " + i +" = " +result);
        }


          }
}

// answer -->>>

//Enter the table number :
//5
//5 * 1 = 5
//5 * 2 = 10
//5 * 3 = 15
//5 * 4 = 20
//5 * 5 = 25
//5 * 6 = 30
//5 * 7 = 35
//5 * 8 = 40
//5 * 9 = 45
//5 * 10 = 50