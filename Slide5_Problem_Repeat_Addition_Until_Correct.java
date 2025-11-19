package slide5_problem_repeat_addition_until_correct;

import java.util.Scanner;
public class Slide5_Problem_Repeat_Addition_Until_Correct {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while(count<150){
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int n = a + b;
        System.out.println("What is " + a + " + " + b + " ?");
        int m = input.nextInt();
        if(n==m){break;}
            count++;
        }
            System.out.println("Congratulation!!!  your answer is true");
    }
    
}
