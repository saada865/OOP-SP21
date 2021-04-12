package l7as;

public class PizzaOrder {
 
    Pizza one;
    Pizza two;
    Pizza three;
    private int total;
    
    public PizzaOrder(){
        
    } 
    public PizzaOrder(Pizza o){
        
        one = o;
        total = one.calcCost();
    }
    public PizzaOrder(Pizza o, Pizza t){
        
        one = o;
        two = t;
        total = one.calcCost() + two.calcCost();
    }
    public PizzaOrder(Pizza o, Pizza t, Pizza th){
        
        one = o;
        two = t;
        three = th;
        total = one.calcCost() + two.calcCost() + three.calcCost();
    }
    
    public int calcTotal(){
        
        return total;
    }
    
    
}
