package l6hac1;

public class L6HAc1RUNNER {

    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(2000);        
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.annualInterestRate = 3;
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println(saver1.getBalance());
        System.out.println(saver2.getBalance());
        
        //SavingsAccount.modifyInterestRate(4);
        SavingsAccount.annualInterestRate = 4;
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println(saver1.getBalance());
        System.out.println(saver2.getBalance());
        
    }
    
}
