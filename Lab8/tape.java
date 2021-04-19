package l8as1;

public class tape extends publication{
    
    int playingMins;
    
    public tape(){
        
    }
    public tape(String title, int price, int playingMins){
        
        super(title, price);
        this.playingMins = playingMins;
    }
    public void set_playingMins(int playingMins){
        
        this.playingMins = playingMins;
    }
    public int get_playingMins(){
        
        return playingMins;
    }
    @Override
    public void Display(){
        
        System.out.println("Title is: " + title + " Price is: " + price + " Playing minutes are: " + playingMins);
    }
    
}
