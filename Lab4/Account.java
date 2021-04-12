package l4hac2;

public class Account {
    
    private double balance;
    
    Account(){
        }
    Account(double value){
        this.balance = value;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void set_balance(double V){
        this.balance = V;
    }
    public double get_balance(){
        return balance;
        
    }
    
}
