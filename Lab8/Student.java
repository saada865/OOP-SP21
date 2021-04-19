package l8hac;

public class Student extends Person{
    
    private String status; 
    
    public Student(String name, String adress, String phoneNum, String email, String status){
        
        super(name, adress, phoneNum, status);
        this.status = status;
        
    }
    @Override
    public void Display(){
        
        System.out.println("name is: " + name + " email is: " + email + " adress is: " + adress + " phone number is: " + phoneNum 
                + " status is: " + status);
    }
}
