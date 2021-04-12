package l3hac3;

public class Distance {

    double feet;
    double inches;
    
    Distance(){
        
    }
    Distance(double f, double i){
        feet = f;
        inches = i;
    }
    public void display(){
        System.out.println("feet: " + feet + " inches: " + inches);
    }
}
