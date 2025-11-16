
package chapter1_question7_approximate_pi;


public class Chapter1_Question7_Approximate_PI {

    
    public static void main(String[] args) {
        
        double PI1 = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        double PI2 = 4 * (1.0 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13));
        
        System.out.println(" A little Approximate to PI; " + PI1);
        System.out.println(" More Approximate to PI; " + PI2);
    }
    
}
