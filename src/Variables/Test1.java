package Variables;

// In a program, input the side of a square. You have to output the area of the square.

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        int side, area;

        System.out.print("Enter the side of square : ");
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();

        area = side * side;
        System.out.println("Area of Square : " +area);
    }
}

// answer -->>>
//Enter the side of square : 12
//Area of Square : 144