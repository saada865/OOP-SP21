package l9hac1;

public class Comedy extends Movie{
    
    private double fees = 2.50;
    
    @Override
    public double calcLateFees(double days){
    
        return(fees*days);
    }
    
}


