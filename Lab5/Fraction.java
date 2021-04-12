package l5as;

public class Fraction {

    private double ratio;
    
    Fraction(){
        
    }
    Fraction(double R){
        this.ratio = R;
    }
    public void set(double R){
        this.ratio = R; 
    }
    public double get(){
        return ratio;
    }
    public void display(){
        System.out.println("ratio is : " + this.ratio);
    }
    public boolean equals(Fraction x){
        
        if(this.ratio == x.get()){
            return true;
        }
        
        return false; 
    } 
}
