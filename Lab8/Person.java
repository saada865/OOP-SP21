package l8hac;

public class Person {
    
    protected String name; 
    protected String adress;
    protected String phoneNum;
    protected String email;
    
    public Person(){
        
    }
    public Person(String name, String adress, String phoneNum, String email){
        
        this.name = name;
        this.email = email;
        this.adress = adress;
        this.phoneNum = phoneNum;
    }
    public void Display(){
        
        System.out.println("name is: " + name + " email is: " + email + " adress is: " + adress + " phone number is: " + phoneNum);
    }
    
    
    
}
