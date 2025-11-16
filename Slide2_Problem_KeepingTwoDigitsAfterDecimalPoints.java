package slide2_problem_keepingtwodigitsafterdecimalpoints;

import java.util.Scanner;
public class Slide2_Problem_KeepingTwoDigitsAfterDecimalPoints {

   
    public static void main(String[] args) {
        
        // Write a program that displays the sales tax with two digits after the decimal point.\
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double purchaseAmount = input.nextDouble();

        System.out.println
        ("Enter the sales tax rate (e.g., 5 for 5%): ");
        double taxRate = input.nextDouble();
        double salesTax = purchaseAmount * (taxRate / 100);
        System.out.printf("Sales Tax: %.2f \n", salesTax);
        
    }
    
}
