package l5hac1;

public class Distance {
    
    private int feet;
    private int inches;
    
    Distance(){
        
    }
    Distance(int F, int I){
        this.feet = F;
        this.inches = I;
    }
    public void set_feet(int feet){
        this.feet = feet;
       
    }
    public void set_inches(int inches){
        this.inches = inches;
       
    }
    public int get_feet(){
        
        return this.feet;
    }
    public int get_inches(){
        
        return this.inches;
    }
    public void display(){
        
        System.out.println("Feet are :" + this.feet);
        System.out.println("Inches are :" + this.inches);
        
    }
    public Distance adder(Distance a, Distance b){
        
        Distance x = new Distance();
        
        x.feet = a.get_feet() + b.get_feet();
        x.inches = a.get_inches() + b.get_inches();
        
        return x;        
    }
    
}
