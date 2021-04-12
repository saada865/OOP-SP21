package l3as2;

public class L3As2RUNNER {

    public static void main(String[] args) {
       
        Time pindi = new Time(10, 23, 76);
        pindi.display();
        pindi.validity();
        System.out.println();
        System.out.println("Time after validity checks ");
        System.out.println();
        pindi.display();
    }
    
}
