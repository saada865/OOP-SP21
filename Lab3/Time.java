package l3as2;

public class Time {

int hours;
int minutes;
int seconds;

Time(){
    
}   
Time(int H, int M, int S){
    hours = H;
    minutes = M;
    seconds = S;
    
}
public void display(){
    System.out.print("hours:" + hours);
    System.out.print("minutes:" + minutes);
    System.out.println("seconds:" + seconds);
}
public void validity(){
    
    if(minutes > 60){
        minutes -= 60;
        hours++;
    }
    if(seconds > 60){
        
        seconds -= 60;
        minutes++;
    }
}


}
