package slide3_problem_lottery;
import java.util.Scanner;
public class Slide3_Problem_Lottery {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("      This program gives you ten chances to win the lottery prizes!!!");
        for(int chances =1; chances<=100; chances++){
        int m = (int)(Math.random()*100);
        System.out.print(chances + ". Enter your two digits Number: ");
        int num = input.nextInt();
        int m1 = m/10;
        int m2 = m%10;
        int num1 = num/10;
        int num2 = num%10;
        if(num==m){
            System.out.println("Congratulation!! Your award is 10000$ " + "\n>>the lottery number is (" + m + ")" + "\n");
            if(m1==0 && num1==0 && m2==num2){System.out.println(">>Your Number matches to the lottery Number");}
            else if(m2==0 && num1==0 && m1==num2){System.out.println(">>Your Number matches to the lottery Number");}
        }
        else if(m1==0 && m2==0 && num1==0 && m2==num2){System.out.println("Congratulation!! Your award is 10000$ " + "\n>>the lottery number is (" + m2 + ")" + "\n");}
        else if(m1==0 && m2==0 && num1==0 && m2!=num2){System.out.println("Program end \n>>the lottery number is (" + m2 + ")" + "\n");}
        else if(m1==0 && num1==0 && m2!=num2){System.out.println("Program end \n>>the lottery number is (" + m2 + ")" + "\n");}
        else if(m2==0 && num1==0 && m1!=num2){System.out.println("Program end \n>>the lottery number is (" + m2 + ")" + "\n");}        
        else if(m1==num1 || m2==num2 || m1==num2 || m2==num1){
            System.out.println("Congratulation!! Your award is 3000$ " + "\n>>the lottery number is (" + m + ")");
            if(m1==0 && m2==num1){System.out.println(">>Your first digit from your Number matches to the lottery Number");}
            else if(m1==0 && m2==num2){System.out.println(">>Your second digit from your Number matches to the lottery Number");}
            else if(num1==0 && m1==num2){System.out.println(">>Your Number matches to the first digit in the lottery Number");}
            else if(num1==0 && m2==num2){System.out.println(">>Your Number matches to the second digit in the lottery Number");}
            else if(m1==num1){System.out.println(">>Your first digit from your Number matches to the first digit in the lottery Number");}
            else if(m2==num2){System.out.println(">>Your second digit from your Number matches to the second digit in the lottery Number");}
            else if(m1==num2){System.out.println(">>Your second digit from your Number matches to the first digit in the lottery Number");}
            else if(m2==num1){System.out.println(">>Your first digit from your Number matches to the second digit in the lottery Number");}
            System.out.println("");
        }            
                
            else{System.out.println("Program end \n>>the lottery number is (" + m + ")" + "\n");} 
        }
    }    
}
