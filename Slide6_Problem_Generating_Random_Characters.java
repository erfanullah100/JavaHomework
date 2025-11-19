
package slide6_problem_generating_random_characters;


public class Slide6_Problem_Generating_Random_Characters {

    
    public static void main(String[] args) {
        
        int randomCode = (int)(Math.random() * (65535 + 1));
        char randomChar = (char) randomCode;

        System.out.println("Random Unicode code: " + randomCode);
        System.out.println("Random character: " + randomChar);


    }
    
}
