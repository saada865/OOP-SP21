package l7ac1;

public class L7Ac1RUNNER {

    public static void main(String[] args) {
       
        studentRecord s = new studentRecord("MBA");
    employeeRecord e = new employeeRecord(111, 50000);
    Manager m1 = new Manager("sjh", 5000.98, e, s);
    m1.display();

        
        
        
        
    }
    
}
