package l8as2;

public class Computer {
    
    protected double wordsize;
    protected double storagesize;
    protected double speed;
    
    public Computer(){
        
    }
    
    public Computer(double wordsize, double storagesize, double speed){
        
        this.wordsize = wordsize;
        this.storagesize = storagesize;
        this.speed = speed;
        
    }
    
    public void Display(){
        
        System.out.println("Word size is: " + wordsize + " Storage size is: " + storagesize + " Speed is: " + speed);
        
    }
    
}
