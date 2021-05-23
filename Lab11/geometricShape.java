package l11as1;

public class geometricShape implements Shape{

    private double a;
    private double b;
    private double c;
    
    public geometricShape(double a, double b, double c){
        
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double area(){
    
    return a*b*c;
}

    
}

