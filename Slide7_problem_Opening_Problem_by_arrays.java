
package slide7_problem_opening_problem_by_arrays;
import java.util.Scanner;
    

public class Slide7_problem_Opening_Problem_by_arrays {

    public static void main(String[] args) {
        
           Scanner input = new Scanner(System.in);
        double[] numbers = new double[100];
        double sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / 100;
        int count = 0;


        for (int i = 0; i < 100; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Average = " + average);
        System.out.println("Numbers above average = " + count);

    }
    
}
