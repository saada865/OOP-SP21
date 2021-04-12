package l2ac3;

public class CarPart {
    
    private String modelNumber;
    private String partNumber;
    private String cost;
    
    public void setparameter(String x, String y,String z){
        
    modelNumber=x;
    partNumber=y;
    cost=z;
}

public void display(){
    
System.out.println("Model Number: " + modelNumber + "Part Number: " + partNumber + " Cost: "+ cost);
} 
}
