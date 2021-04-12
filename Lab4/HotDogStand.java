package l4as;

public class HotDogStand {

private int ID;
private int salesCount;

public HotDogStand(int id, int sale){
    
    this.ID = id;
    this.salesCount = sale;
    
}

public int plus(){
    return(salesCount++);
}

public int get(){
    return salesCount;
}

public void plainHotDog(){
    plus();
    System.out.println("Sold a plain hot dog ");
}

public void spicyHotDog(){
    plus();
    System.out.println("Sold a spicy hot dog ");
}

public void largeHotDog(){
    plus();
    System.out.println("Sold a large hot dog ");
}

    
}
