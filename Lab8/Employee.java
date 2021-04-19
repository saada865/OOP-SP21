package l8hac;
import java.util.*;

public class Employee extends Person{
    
    protected String office; 
    protected int salary;
    protected Date dateHired;
    
    public Employee(String name, String adress, String phoneNum, String email, String office, int salary, Date dateHired){
        
        super(name, adress, phoneNum, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    
    @Override
    public void Display(){
        
        System.out.println("name is: " + name + " email is: " + email + " adress is: " + adress + " phone number is: " + phoneNum 
                + " office is: " + office + " salary is: " + salary + " date hired is: " + dateHired);
    }
}
