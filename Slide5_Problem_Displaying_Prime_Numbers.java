
package slide5_problem_displaying_prime_numbers;


public class Slide5_Problem_Displaying_Prime_Numbers {

   
    public static void main(String[] args) {
        
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBERS_PER_LINE = 10;

        int count = 0;
        int number = 2;

        while (count < NUMBER_OF_PRIMES) {
            if (isPrime(number)) {
                count++;
                System.out.print(number + "\t");

                if (count % NUMBERS_PER_LINE == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        for (int divisor = 2; divisor <= Math.sqrt(n); divisor++) {
            if (n % divisor == 0) {
                return false;
            }
        }
        return true;

    }
    
}
