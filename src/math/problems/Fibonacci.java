package math.problems;

public class Fibonacci {

    /*
    Write a method that will print or return at least 40 Fibonacci numbers

      0,1,1,2,3,5,8,13
     */

    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int d = x + y;
        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < 40; i++) {
            System.out.println(d);
            d = (x + y);
            x = y;
            y = d;

        }

    }
}
