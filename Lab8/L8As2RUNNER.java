package l8as2;

public class L8As2RUNNER {

    public static void main(String[] args) {
        
        Computer hp = new Computer(12, 2, 3);
        Laptop dell = new Laptop(1, 2, 3, 4, 3, 4, 5);
        dell.Display();
        
        hp.Display();
        hp.speed = 21;
        hp.Display();
        System.out.println("Storage of computer is " + hp.storagesize);
                
    }
    
}
