package l4ac1;

public class L4Ac1RUNNER {

    public static void main(String[] args) {
        
circle c1 = new circle();
c1.setRadius(5);
System.out.println("circumference of Circle 1 is ");
c1.area();
int r = c1.getRadius(); 
circle c2 = new circle(r);
c2.setRadius(5);
System.out.println("circumference of Circle 2 is " );
c2.area();
        
        
    }
    
}
