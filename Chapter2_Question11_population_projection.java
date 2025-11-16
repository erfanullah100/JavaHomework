package chapter2_question11_population_projection;
import java.util.Scanner;
public class Chapter2_Question11_population_projection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        long years = input.nextInt();
        long secondsInYear = 365*24*60*60;
        long births = (secondsInYear / 7) * years;
        long deaths = (secondsInYear / 13) * years;
        long population  = births - deaths;
        System.out.println("The population in " + years + " years is " + population);
    }  
}
