package l6hac2;

public class myClass {

    private int value;
    private static int count_create = 0;
    private static int count_del = 0;

    myClass(int V){
        
        this.value = V;
        count_create++;
    }
    public int delete(){
        
        return count_del++;
    }
    
    public void print(){
        
        System.out.println(count_create);
        System.out.println(count_del);
    }
    
}
