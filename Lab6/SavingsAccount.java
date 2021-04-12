package l6hac1;

public class SavingsAccount {
    
    public static double annualInterestRate;
    private double savingsBalance;
    
    SavingsAccount(double sB){
       
        this.savingsBalance = sB;     
    }
    
    public void calculateMonthlyInterest(){
        
        double val = (savingsBalance * annualInterestRate)/12;
        this.savingsBalance = val;   
    }
    
    public static void modifyInterestRate(double v){
        
        annualInterestRate = v;    
    }
    
    public double getBalance(){
        
        return savingsBalance;
        
    }

}
