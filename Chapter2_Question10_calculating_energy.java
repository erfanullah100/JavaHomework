package chapter2_question10_calculating_energy;

import java.util.Scanner;
public class Chapter2_Question10_calculating_energy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double M = input.nextDouble();
        System.out.print("Enter the initial temperature(degree Celsius): ");
        double it = input.nextDouble();
        System.out.print("Enter the final temperature(degree Celsius): ");
        double ft = input.nextDouble();
        double Q = M * (ft - it) * 4184;
        System.out.println("The energy(joules) needed is "  + Q);
    }
}
