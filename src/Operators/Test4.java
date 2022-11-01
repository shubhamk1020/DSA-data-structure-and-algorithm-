package Operators;

public class Test4 {
    public static void main(String[] args) {
        int x = 10, y=5;
        int exp1 = (y*(x/y+x/y));
        int exp2 = (y*x/y + y*x/y);

        int G = exp1 + exp2;
        System.out.println(exp1);
        System.out.println(exp2);
        System.out.println("Add exp1 + exp2 : " + G);
    }
}

// answer -->> 20 20 Add exp1 + exp2 : 40