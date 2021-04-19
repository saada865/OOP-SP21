package l8hac;

import java.util.Date;

public class Staff extends Employee{
    
    protected String title;
    
     public Staff(String name, String adress, String phoneNum, String email, String office, int salary, Date dateHired, 
             String title){
      super(name, adress, phoneNum, email, office, salary, dateHired);   
      this.title = title;
         
     }
    
   @Override
    public void Display(){
        
        System.out.println("name is: " + name + " email is: " + email + " adress is: " + adress + " phone number is: " + phoneNum 
                + " office is: " + office + " salary is: " + salary + " date hired is: " + dateHired 
                + " title is: " + title);
    }
}
