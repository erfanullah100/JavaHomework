package slide3_problem_body_mass_index;

import java.util.Scanner;
public class Slide3_Problem_Body_Mass_Index {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your weight(Kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height(cm): ");
        double height = scanner.nextDouble();
        double BMI = (weight/((height/100)*(height/100)));
        System.out.println("Your BMI is: "+BMI);
        if(BMI<=18.5){
            System.out.println("You are underweight");    
        }
        if(24.9>=BMI && BMI>18.5){
            System.out.println("You are healthy");
        }
        if(29.9>=BMI && BMI>=25){
            System.out.println("You are overweight");
        }
        if(30<=BMI){
            System.out.println("You are obese");
        }
        
        else{System.out.println("Have a Good TIME");}
    }
    
}
