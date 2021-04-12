package l2as2;

public class L2As2RUNNER {

    public static void main(String[] args) {
        
        Rectangle blue = new Rectangle();
        blue.length = 21;
        blue.width = 2;
        blue.checkNegative(blue.width, blue.length);
        
        Rectangle orange = new Rectangle();
        orange.length = 5;
        orange.width = 10;
        orange.printArea();
    }
    
}
