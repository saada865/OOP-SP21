package l8hac;

import java.util.Date;

public class Faculty extends Employee{
    
    private int officeHours;
    private String rank;
    
    public Faculty(String name, String adress, String phoneNum, String email, String office, int salary, Date dateHired,
    int officehours, String rank){
        
        super(name, adress, phoneNum, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    @Override
    public void Display(){
        
        System.out.println("name is: " + name + " email is: " + email + " adress is: " + adress + " phone number is: " + phoneNum 
                + " office is: " + office + " salary is: " + salary + " date hired is: " + dateHired 
                + " office hours are: " + officeHours + " rank is: " + rank);
    }
    
}
