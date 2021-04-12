package l2hac2;

public class time {
    
    int seconds;
    int minutes;
    int hours;
    
    public time(){
        
    }
    public time(int s){
        this.seconds = s;
    } 
    public time(int m, int s){
        this.minutes = m;
        this.seconds = s;
    } 
    
    public void display(){
   
        System.out.println("hours " + this.hours + "minutes " + this.minutes + " seconds "+ this.seconds);
        
    }
    public void validityCheck(){
        
        if (seconds > 60){
            seconds -= 60;
            minutes++;
        }
        if (minutes > 60){
          minutes -= 60;
          hours++;
        }
        
    }
    
    
    
}
