package Variables;

// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
//an eraser. You have to output the total cost of the items back to the user as their bill.
//(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        float pencil, pen, eraser;
        float total, gst;

        System.out.print("Enter Pencil Cost: ");
        Scanner sc = new Scanner(System.in);
        pencil = sc.nextFloat();

        System.out.print("Enter Pen Cost: ");
        pen = sc.nextFloat();

        System.out.print("Enter Eraser Cost: ");
        eraser = sc.nextFloat();

        total = pencil + pen + eraser;
        gst = total*0.18f;

        float total_amount = total + gst;

        System.out.println("Total Cost : " +total);
        System.out.println("Gst Tax is : " +gst);
        System.out.println("Billing with gst with 18% charge : " +total_amount);

    }
}

// answer -->>>
//Enter Pencil Cost: 5
//Enter Pen Cost: 10
//Enter Eraser Cost: 5
//Total Cost : 20.0
//Gst Tax is : 3.6000001
//Billing with gst with 18% charge : 23.6
