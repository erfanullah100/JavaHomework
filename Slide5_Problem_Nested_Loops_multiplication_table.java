
package slide5_problem_nested_loops_multiplication_table;

import java.util.Scanner;
public class Slide5_Problem_Nested_Loops_multiplication_table {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i = 1; i<=10; i++){
        
            System.out.println("");
            
           for(int x = 1; x<=10; x++){
            System.out.print("  ");   
            int m = x*i;
                if(m<10){
                   System.out.print(x + " X " + i + " = " + m + "   ");
                }
                else if(i==10){
                    System.out.print(x + " X " + i + " = " + m + " ");
                }
                else{
                    System.out.print(x + " X " + i + " = " + m + "  ");
                }
           }
        }

    }
    
}
