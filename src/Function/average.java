package Function;
import java.util.Scanner;

public class average {

    public static double printAvg(double a, double b, double c) {

    return (a+b+c)/3;

    }

    public static void main(String[] args) {
        System.out.println("Enter first num: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.println("Enter second num: ");
        double b = sc.nextInt();
        System.out.println("Enter third num: ");
        double c = sc.nextInt();

       System.out.println("Average of three no is : "+printAvg(a,b,c));

    }

}
