package l2ac2;

public class L2Ac2RUNNER {

    public static void main(String[] args) {
       
    Date date1, date2;
        
    date1 = new Date();
    date1.month = "December";
    date1.day = 31;
    date1.year = 2012;
    
    System.out.println("date1:");
    
    date1.display();
    date2 = new Date();
    date2.month = "July";
    date2.day = 4;
    date2.year = 1776;
    
    System.out.println("date2:");
    
    date2.display();

    }
    
}
