package l7hac3;

public class Line {
    
    Point startPoint;
    Point endPoint;
    
    public Line(){
        
    }
    public Line(Point sP, Point eP){
        
        startPoint = sP;
        endPoint = eP;
    }
    public double distance(){
        
        double a = (endPoint.get_x() - startPoint.get_x());
        Math.pow(a,2);
        double b = (endPoint.get_y() - endPoint.get_y());
        Math.pow(b,2);
        double c = Math.sqrt(a+b);
        return c;
    }
    
}
