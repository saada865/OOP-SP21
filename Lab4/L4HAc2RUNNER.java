package l4hac2;

public class L4HAc2RUNNER {

    public static void main(String[] args) {
       
        Account saad = new Account();
        saad.set_balance(2000);
        
        Account nomi =  new Account();
        nomi.set_balance(saad.get_balance());
        
        System.out.println(saad.get_balance());
        System.out.println(nomi.get_balance());
        
    }
    
}
