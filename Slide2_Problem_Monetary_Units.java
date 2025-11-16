package slide2_problem_monetary_units;

import java.util.Scanner;
public class Slide2_Problem_Monetary_Units {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount of dollars: ");
        double dollars = input.nextDouble();
        double maxdollars =  dollars;
        double maxquarters =  dollars * 4;
        double maxdimes =  dollars * 10;
        double maxnickels =  dollars * 20;
        double maxpennies =  dollars * 100;        
        System.out.println("maxdollars " + maxdollars);
        System.out.println("maxquarters " + maxquarters);
        System.out.println("maxdimes " + maxdimes);
        System.out.println("maxnickels " + maxnickels);
        System.out.println("maxpennies " + maxpennies);

    }
    
}
