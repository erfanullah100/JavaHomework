package slide5_problem_guessing_numbers;

import java.util.Scanner;
public class Slide5_Problem_Guessing_Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 100 ");
        int n = (int)(Math.random()*100);
        for(int c=1; c<=10;c++){
            System.out.println("((" + c + ".))");
        int m = input.nextInt();
        if(m>n){System.out.println("It's too high");}
        else if(m<n){System.out.println("It's too low");}
        else{System.out.println("Congratulation!!!"); break;}
        }
    
    }   
}
