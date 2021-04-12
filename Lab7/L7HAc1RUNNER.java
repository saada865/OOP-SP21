package l7hac1;

public class L7HAc1RUNNER {

    public static void main(String[] args) {
        
        Adress a = new Adress(12, 2, "mansa", "i12");
        Person p = new Person("billa", a);
        System.out.println(a.get_city());
        
    }
    
}
