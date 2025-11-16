package chapter1_question8_area_and_perimeter_of_a_circle;


public class Chapter1_Question8_Area_and_perimeter_of_a_circle {

    
    public static void main(String[] args) {
        
        // radius must be 5.5
        double radius = 5.5;
        double perimeter = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println("Perimeter of the circle is equal to: " + perimeter);
        System.out.println("Area of the circle is equal to: " + area);
        
    }
    
}
