package chapter2_question8_current_time;

import java.util.Scanner;
public class Chapter2_Question8_Current_time {


    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the time zone offset to GMT: ");
    double offset = input.nextDouble();
    long totalMillisseconds = System.currentTimeMillis();
    long totalSeconds = (totalMillisseconds / 1000);
    long year = (totalSeconds / 31557600 ) + 1971;
    long m = (totalSeconds % 31557600);
    long month = m / 2629800;
    long day = ((m % 2629800) / 86400) + 1;
    long currentSecond = (totalSeconds % 60);
    long totalMinutes = (totalSeconds / 60) - 30;
    long currentMinute = totalMinutes % 60;       
    long totalHours = totalMinutes / 60;
    long currentHour = (long) ((totalHours + offset) % 24);
    System.out.println("The current date is " + year + "/" + month + "/" + day);
    System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);


    }
    
}
