package l8as1;

public class publication {
    
   protected String title;
   protected int price;
   
   public publication(){
       
   }
   public publication(String title, int price){
       
       this.title = title;
       this.price = price;
   }
   public void set_title(String title){
       
       this.title = title;
   }
   public void set_price(int price){
       
       this.price = price;
   }
   public String get_title(){
       
       return title;
   }
   public int get_price(){
       
       return price;
   }
   public void Display(){
       
       System.out.println("Title is: " + title + " Price is: " + price);
   }
    
}
