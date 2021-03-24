package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
        Write a method to print the list of prime numbers from 2 to 1,000,000
            Solving the problem should be your first priority, however bonus points if you can figure out how to
            improve algorithmic efficiency

         Print out the prime numbers in the given range.
         */
        System.out.println(isPrime(5000));

    }

    public static boolean isPrime(int n) {
        if (n == 2) return true;

        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i = i + 2) {
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

}
