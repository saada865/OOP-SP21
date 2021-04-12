package l3hac2;

public class L3HAc2RUNNER {

    public static void main(String[] args) {
        
        Account saad = new Account(1000, "debit");
        saad.depositCredit(120);
        System.out.println(saad.balance);
        
        Account sarmad = new Account();
        sarmad.balance = 2000;
        sarmad.account_type = "credit";
        sarmad.withdrawCredit(200);
        System.out.println(sarmad.balance);
    }
    
}
