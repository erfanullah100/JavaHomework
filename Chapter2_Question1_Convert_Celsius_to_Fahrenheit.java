package chapter2_question1_convert_celsius_to_fahrenheit;

import java.util.Scanner;

public class Chapter2_Question1_Convert_Celsius_to_Fahrenheit {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Celsius: ");
        double Celsius = input.nextDouble();
        double Fahrenheit = (Celsius * 9.0/5.0) + 32.0;
        System.out.println(Celsius + " Celsius is " + Fahrenheit + " Fahrenheit");
    }
    
}
