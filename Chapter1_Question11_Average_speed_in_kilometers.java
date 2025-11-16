package chapter1_question11_average_speed_in_kilometers;

public class Chapter1_Question11_Average_speed_in_kilometers {

  
    public static void main(String[] args) {
        
        // d = 24 miles and T = 1h 40m 35s V =?(kilometer/hour)
        double d,T,V;
        d = 24.0 * 1.6;
        T = 1.0 + 40.0/60.0 + 35.0/3600.0;
        V = (d/T);
        System.out.println("Average Speed is equal to: " + V + " kilometer/hour ");
        
    }
    
}
