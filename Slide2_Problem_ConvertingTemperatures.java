package slide2_problem_convertingtemperatures;

import java.util.Scanner;

public class Slide2_Problem_ConvertingTemperatures {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Write a program that converts a Fahrenheit degree to Celsius using the formula:
           celsius = (5.0 / 9) * (fahrenheit – 32) */
        System.out.println("Enter a degree in Fahrenheit: ");
        double Fahrenheit = input.nextDouble();
        double Celsius = (5/9.0) * (Fahrenheit - 32);
        System.out.println(Fahrenheit + " Fahrenheit is " + Celsius + " Celsius");

    }
    
}
