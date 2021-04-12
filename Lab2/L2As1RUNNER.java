package l2as1;

public class L2As1RUNNER {

    public static void main(String[] args) {
       
        Car first = new Car("corolla ");
        first.printName();
        
        Car second = new Car();
        second.carName = "civic";
        second.companyName = "honda";
        second.TurnCarOn();
        second.TurnCarOff();
        
        Car third =new Car(2021, 1500 , "sportage", 'A', "kia");
        third.printName();
        third.printCondition();
        third.printMileage();
        
    }
    
}
