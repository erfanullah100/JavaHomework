package chapter2_question2_compute_the_volume_of_cylinder;

import java.util.Scanner;

public class Chapter2_Question2_Compute_the_volume_of_cylinder {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of Cylinder: ");
        double radius = input.nextDouble();
        System.out.println("Enter the height of Cylinder: ");
        double height = input.nextDouble();
        double V = Math.PI * radius * radius * height;
        System.out.println("The volume is: " + V );
    
    }
    
}
