package l9hac1;

public class Movie {
    
    protected String rating; 
    protected String title;
    protected String id;
    protected double fees = 2; 
    
    public String get_rating(){
        
        return rating;
    }
    
    public String get_title(){
        
        return title;
    }
    
    public String get_id(){
        
        return id;
    }
    
    public void set_rating(String rating){
        
        this.rating = rating; 
    }
    
    public void set_title(String title){
        
        this.title = title; 
    }
    
    public void set_id(String id){
        
        this.id = id; 
    }
    
    public double calcLateFees(double days){
        
        return days*fees;   
    }
    
    public boolean equals(Movie compared){
        
        if(this.id.equals(compared.id)){
            
            return true;
        }
        
        else{
        return false;
    }
    }
    
    
}




