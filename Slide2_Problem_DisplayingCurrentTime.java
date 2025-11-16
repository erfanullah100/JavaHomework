package slide2_problem_displayingcurrenttime;


public class Slide2_Problem_DisplayingCurrentTime {

 
    public static void main(String[] args) {
        
        long totalMillisseconds = System.currentTimeMillis();
        // Afghanistan Timezone offset is +4:30
        long offset = (4*60*60*1000) + (30*60*1000);
        totalMillisseconds += offset;
        long totalSeconds = totalMillisseconds / 1000;
        long currentSecond = (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = (totalMinutes % 60);
        long totalHours = totalSeconds / 3600;
        long currentHour = (totalHours % 12);
        long PMorAM = (totalHours % 24);
        if(PMorAM>=1 && PMorAM<12){
            System.out.println("The current Time is --> "+currentHour+" : "+currentMinute+" : "+currentSecond+" AM");
        }
        else{
            System.out.println("The current Time is --> "+currentHour+" : "+currentMinute+" : "+currentSecond+" PM");
        }
    
}
    
}
