package l3ac2;

public class L3Ac2RUNNER {

    public static void main(String[] args) {
       
        Rectangle firstRectangle = new Rectangle();
        firstRectangle.height = 10;
        firstRectangle.width = 20
        
        System.out.println(firstRectangle.calculate_area());
        
        Rectangle secondRectangle = new Rectangle(30, 40);
        System.out.println(secondRectangle.calculate_area());
    }
    
}
