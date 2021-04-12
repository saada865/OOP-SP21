package l7hac3;

public class L7HAc3RUNNER {

    public static void main(String[] args) {
       
        Point point1 = new Point(2, 4);
        Point point2 = new Point(5, 4);
        Point point3 = new Point(7, 3.3);
        Point point4 = new Point(9, 0);
        
        Line line1 = new Line(point1, point2);
        System.out.println(line1.distance());
        point3.display();
        
        Line line2 = new Line(point3, point4);
        System.out.println(line2.distance());
        
    }
    
}
