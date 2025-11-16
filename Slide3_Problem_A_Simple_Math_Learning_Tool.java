package slide3_problem_a_simple_math_learning_tool;

import java.util.Scanner;
public class Slide3_Problem_A_Simple_Math_Learning_Tool {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int v = 1;v<=10; v++){
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
        int n = a + b;
        System.out.println("What is " + a + " + " + b + " ?");
        int m = input.nextInt();
        if(n==m){
            System.out.println("Congratulation!!!  your answer is true");
        }else{
            System.out.println("your answer is false The correct answer is " + n);
        }
        }

    }
    
}
