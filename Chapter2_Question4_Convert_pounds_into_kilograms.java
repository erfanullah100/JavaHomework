package chapter2_question4_convert_pounds_into_kilograms;

import java.util.Scanner;
public class Chapter2_Question4_Convert_pounds_into_kilograms {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.45359237;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
        
    }
    
}
