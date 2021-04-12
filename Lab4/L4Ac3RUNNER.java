package l4ac3;

public class L4Ac3RUNNER {

    public static void main(String[] args) {
        
        point my_point = new point();
        my_point.set_x(2);
        my_point.set_y(2);
        int z = my_point.get_x() + my_point.get_y();
        System.out.println(z+ " z Is ");
    }
    
}
