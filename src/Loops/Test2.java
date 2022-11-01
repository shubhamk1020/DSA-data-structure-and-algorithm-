package Loops;

// Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int choice;
        int evenSum=0;
        int oddSum=0;


        do {
            System.out.print("Enter the number: ");
            number = sc.nextInt();


            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.println("Do you want to print more number ? if you print more number press 1, ortherwise you choice 0");
            choice = sc.nextInt();
        }
        while (choice == 1);
        System.out.println("sum of even number : " +evenSum);
        System.out.println("sum of odd number : " +oddSum);
    }

}

// answer-->>>

//Enter the number: 12
//Do you want to print more number ? if you print more number press 1, ortherwise you choice 0
//1
//Enter the number: 25
//Do you want to print more number ? if you print more number press 1, ortherwise you choice 0
//0
//sum of even number : 12
//sum of odd number : 25