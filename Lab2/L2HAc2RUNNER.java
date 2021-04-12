package l2hac2;

public class L2HAc2RUNNER {

    public static void main(String[] args) {
       
        time newTime = new time(21, 63);
        newTime.hours = 5;
        newTime.display();
        newTime.validityCheck();
        newTime.display();
    }
    
}
