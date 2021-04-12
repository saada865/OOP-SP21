package l4hac3;

public class student {
    
    private String name;
    private int Result_array[] = new int[6];
    
    public student(String N, int arr[]){
        this.name = N; 
        this.Result_array = arr;
    }
    public double Average(){
        
        double ave = 0; 
        for (int i = 0; i < Result_array.length; i++){
        
            ave += Result_array[i];
            
            }
        
        return ave/Result_array.length;
    }
    public void check(double average1, double  average2){
        if(average1 > average2)
       {
           System.out.println("student1 has a higher average");
       }        
       else if (average1 < average2)
           {
           System.out.println("student2 has a higher average");
       }
    }
    
    
}
