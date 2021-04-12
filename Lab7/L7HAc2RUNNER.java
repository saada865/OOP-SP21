package l7hac2;

public class L7HAc2RUNNER {

    public static void main(String[] args) {
        
        Adress a = new Adress(12, 2, "mansa", "i12");
        Person p = new Person("billa", a);
        Book b = new Book(p, "40 rules", "aujla");
        a.display();
        a.set_city("lyallpur");
        a.set_streetNum(43);
        a.display();
        a = new Adress(5, 90, "lahore", "r8");
        p.set_adress(a);
        a.display();
        
        
        
        
    }
    
}
