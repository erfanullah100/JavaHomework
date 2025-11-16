package chapter1_question10_average_speed_in_miles;


public class Chapter1_Question10_Average_speed_in_miles {


    public static void main(String[] args) {
        // d = 14KM and T = 45m 30s V =?(mile/hour)
        double d,T,V;
        d = (14.0 / 1.6);
        T = (45.0/60.0) + (30.0/3600.0);
        V = (d/T);
        System.out.println("Average Speed is equal to: " + V + " mile/hour ");
        
        
    }
      
}
