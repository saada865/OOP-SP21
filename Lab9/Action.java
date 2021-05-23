package l9hac1;

public class Action extends Movie{
 
    private double fees = 5;  
    
    
    @Override
    public double calcLateFees(double days){
        
        return fees*days;
    }
    
    
    public void fun(){
        double  r =0 ;
    if(fees > 4){
        
        System.out.println(super.calcLateFees(fees));
        
    }
    //return r;
    }
    
    
}
