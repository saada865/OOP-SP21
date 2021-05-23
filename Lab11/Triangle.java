package l11as3;

public class Triangle extends GeometricShape{
    
    private double height;
    private double base;
    
    public Triangle(double height, double base){
        
        this.base = base;
        this.height = height;
    }
    
    public double area(){
        
        return (base+height)/2;   
    }
}
