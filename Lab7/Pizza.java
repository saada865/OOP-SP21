package l7as;

public class Pizza {
    
    private String size;
    private double cheese_toppings;
    private double pepperoni_toppings;
    private double ham_toppings;
    
    Pizza(){
        
    }
    Pizza(String s, double cT, double pT, double hT){
        
        size = s;
        cheese_toppings = cT;
        pepperoni_toppings = pT;
        ham_toppings = hT;
        
    }
    public String get_size(){
        
        return size;
    }
    
    public double get_cheese_toppings(){
        
        return cheese_toppings;
    }
    
    public double get_pepperoni_toppings(){
        
        return pepperoni_toppings;
    }
    
    public double get_ham_toppings(){
        
        return ham_toppings;
    }
    
    public void set_size(String s){
        
        size = s;
    }
    public void set_cheese_toppings(double cT){
        
        cheese_toppings = cT;
    }
    public void set_pepperoni_toppings(double pT){
        
        pepperoni_toppings = pT;
    }
    public void set_ham_toppings(double hT){
        
        ham_toppings = hT;
    }
    
    public double calcCost(){
        
        double cost = 0;
        
        if (size.equals("small")){
            cost = cheese_toppings * 2 + pepperoni_toppings * 2 + ham_toppings * 2;
            cost += 10;
            
        }
        else if (size.equals("medium")){
            cost = cheese_toppings * 2 + pepperoni_toppings * 2 + ham_toppings * 2;
            cost += 12;
            
        }
        else if (size.equals("large")){
            cost = cheese_toppings * 2 + pepperoni_toppings * 2 + ham_toppings * 2;
            cost += 14;
            
        }
        
        return cost;
    }
    
    public void getDescription(){
        
        System.out.println("Size of the pizza is : " + size + " |cheese toppings are : " + cheese_toppings + 
                " |pepperoni toppings are : " + pepperoni_toppings + " |ham toppings are : " + ham_toppings);
    
    }
    
    
}
