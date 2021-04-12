package l7as;

public class L7AsRUNNER {

    public static void main(String[] args) {
        
        Pizza first = new Pizza("large", 2, 3, 4);
        Pizza second = new Pizza("large", 4, 1, 2);
        Pizza third = new Pizza("large", 0, 9, 1);
        
        first.calcCost();
        first.set_cheese_toppings(6);
        first.getDescription();
        
        int n = 8;
        second.set_cheese_toppings(n);
        second.getDescription();
        
        third.getDescription();
        
        
        PizzaOrder last_order = new PizzaOrder(first, second);
        System.out.println("total bill is: $ " + last_order.calcTotal());
        
        
    }
    
    
}

