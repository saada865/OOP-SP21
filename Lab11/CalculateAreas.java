package l11as3;

public class CalculateAreas {
    
    private static int counter = 0;
    
    public GeometricShape array[] = new GeometricShape[3]; 
    public double arr[] = new double[3];
    
    public void add(GeometricShape obj){
        
        array[counter] = obj;
        arr[counter] = obj.area();
        //System.out.println(obj.area());
        counter++;
        
    }
    
    public void printAreas(){
        
        for(int i = 0; i < counter; i++){
            
            System.out.println(arr[i]);
        }
        
    }
    
}
