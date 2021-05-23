package l11as3;

public class Rectangle extends GeometricShape{
    
     private double length;
    private double width;
    
    Rectangle(double length, double width){
        
        this.length = length;
        this.width = width;
        
    }
    
    public double area(){
        
        return length*width;
    }
    
}
