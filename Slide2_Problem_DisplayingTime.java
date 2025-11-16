package slide2_problem_displayingtime;


public class Slide2_Problem_DisplayingTime {

  
    public static void main(String[] args) {
        
        long totalMillisseconds = System.currentTimeMillis();
        // Afghanistan Timezone offset is +4:30
        long offset = (4*60*60*1000) + (30*60*1000);
        totalMillisseconds += offset;
        long totalSeconds = totalMillisseconds / 1000;
        long currentSecond = (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = (totalMinutes % 60);
        System.out.println("The current Second is: "+currentSecond);
        System.out.println("The current Minute is: "+currentMinute);

    }
    
}
