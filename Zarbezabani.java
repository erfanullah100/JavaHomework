package zarbezabani;


public class Zarbezabani {

   
    public static void main(String[] args) {
        
        for(int i = 1; i<=110; i++){
        
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

