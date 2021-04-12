package l4as;

public class L4AsRUNNER {

    public static void main(String[] args) {
        
        HotDogStand firstStall = new HotDogStand(1, 9);
        HotDogStand secondStall = new HotDogStand(2, 5);
        HotDogStand thirdStall = new HotDogStand(3, 4);
        
        
        firstStall.largeHotDog();
        secondStall.plainHotDog();
        secondStall.spicyHotDog();
        thirdStall.largeHotDog();
        thirdStall.largeHotDog();
        
        System.out.println(firstStall.get());
        System.out.println(secondStall.get());
        System.out.println(thirdStall.get());
        
        
    }
    
}
