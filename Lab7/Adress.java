package l7hac2;

public class Adress {
    
    
    private int streetNum;
    private int houseNum;
    private String city;
    private String code;
    
    public Adress(){
        
    }
    public Adress(int sn, int hn, String ci, String co){
        
        streetNum = sn;
        houseNum = hn;
        city = ci;
        code = co;
        
    }
    
    public void set_streetNum(int sn){
        
        streetNum = sn;
        
    }
    
    public void set_houseNum(int hn){
        
        houseNum = hn;
        
    }
    
    public void set_code(String cd){
        
        code = cd;
        
    }
    
    public void set_city(String ci){
        
        city = ci;
        
    }
    
    
    public int get_streetNum(){
        
        return streetNum;
    }
    
    public int get_houseNum(){
        
        return houseNum;
    }
    
    public String get_code(){
        
        return code;
    }
    
    public String get_city(){
        
        return city;
    }
    public void display(){
    System.out.println("House # " + houseNum + " Street # " + streetNum + " code is " + code + " city is " + city);
          
    }
}



