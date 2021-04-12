package l4ac3;

public class point {
   
    private int x, y;
    
public point(){
   
}
public point(int X, int Y){
    y = Y;
    x = X;
}   

public void set_x(int X){
     x = X;
}
public void set_y(int Y){
    y = Y;
}
public int get_x(){
    return x;
}   
public int get_y(){
    return y;
} 
public void move_points(int change_x, int change_y){
    x = x + change_x;
    y = y + change_y;
    
    System.out.println("After change x is: " + x + " y is: " + y);
    
}
public void display(){
    System.out.println("x is: " + x + " y is: " + y);
}
    
}
