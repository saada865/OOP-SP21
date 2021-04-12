package l7as;

public class L7AsRUNNER {

    public static void main(String[] args) {
        
        Pizza first = new Pizza("large", 2, 3, 4);
        Pizza second = new Pizza("large", 4, 1, 4);
        
        first.calcCost();
        first.set_cheese_toppings(6);
        second.getDescription();
        
        PizzaOrder last_order = new PizzaOrder(first, second);
        System.out.println(last_order.calcTotal());
        
        
    }
    
    
}
