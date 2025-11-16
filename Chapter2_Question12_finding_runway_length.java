package chapter2_question12_finding_runway_length;

import java.util.Scanner;
public class Chapter2_Question12_finding_runway_length {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculate airplane minimum runway length");
        System.out.print("Enter speed(m/sec): ");
        double v = input.nextDouble();
        System.out.print("Enter acceleration(m/sec^2): ");
        double a = input.nextDouble();
        double length = (v*v)/(2*a);
        System.out.println("The minimum runway length(meter) for this Airplane is " + length);
    }
    
}
