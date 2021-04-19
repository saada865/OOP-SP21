package l8as2;

public class Laptop extends Computer{
    
    private double length;
    private double weight;
    private double height;
    private double width;
    
    public Laptop(){
        
    }
    
    public Laptop(double length, double weight, double height, double width, double speed, double storagesize, double wordsize){
        
        super(wordsize, storagesize, speed);
        this.height = height;
        this.length = length;
        this.weight = weight;
        this.width = width;   
    }
    
    public void Display(){
        
        System.out.println("Word size is: " + wordsize + " Storage size is: " + storagesize + " Speed is: " + speed 
                + " Height is: " + height + " Weight is: " + weight + " Speed is: " + speed + " Length is: " + length);
    }
    
    
}
