package slide5_problem_finding_the_greatest_common_divisor;

import java.util.Scanner;
public class Slide5_Problem_Finding_the_Greatest_Common_Divisor {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first positive integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter second positive integer: ");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 1;

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }

        System.out.println("The greatest common divisor is: " + gcd);

    }
    
}
