package l4hac1;

import java.util.Scanner;

public class L4HAc1RUNNER {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Marks myMarks = new Marks();
        System.out.println("Enter in value of first marks");
        int one = input.nextInt();
        
        myMarks.set_firstMarks(one);
        System.out.println(myMarks.get_firstMarks());
        
        
    }
    
}
