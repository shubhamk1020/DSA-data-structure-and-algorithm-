package Variables;

//What will be the type of result in the following Java code?

public class Test3 {
    public static void main(String[] args) {

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f*b) + (i%c) - (d*s);

        System.out.println("result is : " +result);
    }
}
// answer -->>>
// In the mentioned code, the result variable will be of double type because of type conversion.
//result is : -51155.08479862671