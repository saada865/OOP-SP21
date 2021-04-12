package l5hac1;

public class L5HAc1RUNNER {

    public static void main(String[] args) {
        
        Distance a = new Distance(2, 4);
        Distance b = new Distance(3, 6);
        Distance c = new Distance();
        
        c = a.adder(a, b);
        c.display();
        
    }
    
}
