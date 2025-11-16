package chapter2_question9_average_acceleration;

import java.util.Scanner;
public class Chapter2_Question9_Average_acceleration {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0(m/sec) (first speed): ");
        double v0 = input.nextDouble();
        System.out.print("Enter v1(m/sec) (second speed): ");
        double v1 = input.nextDouble();
        System.out.print("Enter t(sec) (time): ");
        double t = input.nextDouble();
        double acceleration = (v1-v0)/t;
        System.out.println("Average acceleration is " + acceleration);
    }
    
}
