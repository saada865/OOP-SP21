package l11hac3;

interface interF{
    
     String rem();

}
interface interG{
    
    String rem();
}

public class Anything implements interF, interG {
    

     public String rem(){
        
        System.out.println("tsta");
        return "A";
    }
    public String rem(){
        
        System.out.println("tsta");
        return "B";
    }

}
