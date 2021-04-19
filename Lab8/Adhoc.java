package l8ac2;

public class Adhoc extends Employee {
    private int numberOfWorkingDays;
    private int wage;

public Adhoc(String name, String phone, String address, int allowance, int numberOfWorkingDays, int wage){
    
    super(name, phone, address, allowance);
    this.numberOfWorkingDays = numberOfWorkingDays;
    this.wage = wage;
    
}

public void Display(){
    
    System.out.println("Name: " + name + "Phone Number: " + phone +"Address: " + address
    + "Allowance: " + allowance + "Number Of Working Days: " +
    numberOfWorkingDays + "Wage: " + wage);
    
}

}
