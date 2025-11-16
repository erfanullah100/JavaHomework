package chapter2_question7_find_the_number_of_years;

import java.util.Scanner;

public class Chapter2_Question7_Find_the_number_of_years {
    
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of minutes: ");
    int minutes = input.nextInt();
    int totaldays = (minutes/1440);
    int years = (totaldays / 365);
    int days = (totaldays % 365);
    System.out.println(minutes + " minutes is approximately " + years + " years and " + days +" days");
    
    
    
    }
}
