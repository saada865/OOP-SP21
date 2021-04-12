package l3hac2;

public class Account {
    
    double balance;
    String account_type;
    
    Account(){
        
    }
    Account(double b, String accType){
        balance = b;
        account_type = accType;
    }
    public void depositCredit(double increment){
        balance += increment; 
        
    } 
    public void withdrawCredit(double decrement){
        balance -= decrement; 
        
    } 
    
}
