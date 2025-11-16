package slide3_problem_determining_leap_year;

import java.util.Scanner;
public class Slide3_Problem_Determining_Leap_Year {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your a year: ");
        double year = scanner.nextDouble();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("This is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }
        

    }
    
}
