package l2as1;

public class Car {

int model;
float mileage;
String carName;
String companyName;
char condition;
boolean carOn;

Car(int carModel, float carMileage, String CarName, char carCondition, String company){
    
    model = carModel;
    companyName = company;
    carName = CarName; 
    mileage = carMileage;
    condition = carCondition;
    
}

Car(int carModel, String CarName ){
    
    model = carModel;
    carName = CarName; 
    
}

Car(String CarName ){

    carName = CarName; 
    
}

Car(){
    
}

public void TurnCarOn(){
    carOn = true;
    System.out.println("car is on now");
}

public void TurnCarOff(){
    carOn = false;
    System.out.println("car is off now");
    
} 

public void printMileage(){
     System.out.println(mileage);    
    
}

public void printModel(){
     System.out.println(model);    
    
}
public void printCondition(){
     System.out.println(condition);    
    
}

public void printName(){
     System.out.println(carName);    
    
}
    
}
