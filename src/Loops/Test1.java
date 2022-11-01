package Loops;


// How many print hello;
public class Test1 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=0; i<10; i++){
            System.out.println("Hello!!");
            count++;
            i += 2;
  }
        System.out.println("Hello Print "+count +" times");
    }
}

// answer-->>.
 // 4 times
