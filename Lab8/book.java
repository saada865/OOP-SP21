package l8as1;

public class book extends publication{
    
    int pageCount;
    
    public book(){
        
    }
    public book(String title, int price, int pageCount){
        
        super(title, price);
        this.pageCount = pageCount;
    }
    public void set_pageCount(int pageCount){
        
        this.pageCount = pageCount;
    }
    public int get_pageCount(){
        
        return pageCount;
    }
    @Override
    public void Display(){
        
        System.out.println("Title is: " + title + " Price is: " + price + " Page count is: " + pageCount);
    }
    
}
