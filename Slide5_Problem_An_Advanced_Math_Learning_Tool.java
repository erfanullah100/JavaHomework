package slide5_problem_an_advanced_math_learning_tool;

import java.util.Scanner;
public class Slide5_Problem_An_Advanced_Math_Learning_Tool {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int v = 1;v<=10; v++){
        int a = (int)(Math.random() * 10);
        int b = (int)(Math.random() * 10);
            if(a>b){
            int m = a - b;
            System.out.println("What is " + a + " - " + b + " ?");
            int n = input.nextInt();
            if(n==m){
                System.out.println("Congratulation!!!  your answer is true");
            }else{
                System.out.println("your answer is false The correct answer is " + m);
            }
            }else if(b>a){
            int m = b - a;
            System.out.println("What is " + b + " - " + a + " ?");
            int n = input.nextInt();
            if(n==m){
                System.out.println("Congratulation!!!  your answer is true");
            }else{
                System.out.println("your answer is false The correct answer is " + m);
            }
            }else{int m = a - b;
            System.out.println("What is " + b + " - " + a + " ?");
            int n = input.nextInt();
            if(n==m){
                System.out.println("Congratulation!!!  your answer is true");
            }else{
                System.out.println("your answer is false The correct answer is " + m);
            }

    }  
}
        
    }
    
}
