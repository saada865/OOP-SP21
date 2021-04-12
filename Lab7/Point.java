package l7hac3;

public class Point {
    
    private double x_cord;
    private double y_cord;
    
    public Point(){
        
    }
    public Point(double xc, double yc){
        
        x_cord = xc;
        y_cord = yc;
    }
    public double get_x(){
        return x_cord;
    }
    public double get_y(){
        return y_cord;
    }
    public void set_x(double x){
        x_cord = x;
    }
    public void set_y(double y){
        y_cord = y;
    }
    public void display(){
        
        System.out.println("x cordinate is " + x_cord + " y cordinate is " + y_cord);
    }
    
    
}
