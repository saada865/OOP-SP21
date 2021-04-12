package l3ac2;

public class Rectangle 
 
    public double width;
    public double height;
     
    Rectangle(){
        
    }
    Rectangle(double w, double h){
        height = h;
        width = w;
        
    }
    double calculate_area(){
        
        return(width*height);
    }
    
}
