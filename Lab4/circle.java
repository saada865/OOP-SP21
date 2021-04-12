package l4ac1;

public class circle {
    
    private int radius;
    
public circle()
{
radius=7;
}
public circle(int r)
{
radius=r;
}
public void setRadius(int r)
{
radius=r;
}
public int getRadius(){
return radius;
}
  
public void display()
{
System.out.println("radius = "+radius);
}
public void area(){
double a=3.14*radius*radius;
System.out.println("Circumfrance = "+a);
 
}
}
