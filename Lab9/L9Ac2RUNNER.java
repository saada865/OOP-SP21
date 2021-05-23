package l9ac2;

public class L9Ac2RUNNER {

    public static void main(String[] args) {
       
        BasePlusCommEmployee b = new BasePlusCommEmployee("ali", "ahmed", "25kkn" ,100, 5.2, 25000);
double earn = b.earnings();
System.out.println("Earning of employee is " + earn);

    }
    
}
