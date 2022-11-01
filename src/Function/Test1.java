package Function;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and check is Even or not ");
        int num = sc.nextInt();

        if(isEven(num)){
            System.out.println("This is even number ");
        }
        else{
            System.out.println("This is odd number");
        }


    }

    public static boolean isEven(int numb){
        if(numb%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
