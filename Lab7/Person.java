package l7hac2;

public class Person {
    
      private String name;
    private Adress adress;
    
    public Person(){
        
    }
    public Person(String n, Adress a){
        
        name = n;
        adress = a;
    }
    
    public void set_name(String n){
         
        name = n;
    }
    public String get_name(){
        
     return name;   
    }
    public void set_adress(Adress a){
        
        adress = a;
    }
    public Adress get_adress(){
        
        return adress;
    }
    
    
    
}
