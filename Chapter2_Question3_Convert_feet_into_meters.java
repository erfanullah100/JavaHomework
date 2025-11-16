package chapter2_question3_convert_feet_into_meters;

import java.util.Scanner;
public class Chapter2_Question3_Convert_feet_into_meters {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value for feet: ");
        double foot = input.nextDouble();
        double meters = foot/3.28084;
        System.out.println(foot + " feet is " + meters + " meters");
        
    }
    
}
