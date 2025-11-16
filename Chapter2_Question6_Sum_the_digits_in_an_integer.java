package chapter2_question6_sum_the_digits_in_an_integer;

import java.util.Scanner;
public class Chapter2_Question6_Sum_the_digits_in_an_integer {

    
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("Enter a number between 0 and 1000: ");
       int N = input.nextInt();
       int A = N % 10;
       int B = N / 10;
       int C = B % 10;
       int D = B / 10;
       System.out.println("The sum of the digits is: " + (A+C+D));
        
    }
    
}
