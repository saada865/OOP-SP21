package l11as2;

public class L11As2RUNNER {

    public static void main(String[] args) {
       
        Circle circle = new Circle(2);
        Triangle triangle = new Triangle(4.7, 5);
        Rectangle rectangle = new Rectangle(3, 5.6);
        
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
    
}
