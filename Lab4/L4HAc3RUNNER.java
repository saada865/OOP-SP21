package l4hac3;

public class L4HAc3RUNNER {

    public static void main(String[] args) {
         
       int array2[] = {6, 7, 8, 9, 10}; 
       student student1 = new student("saad",  new int[]{1, 2, 3, 4, 5, 6});
       student student2 = new student("bahadur", array2);
       
       student2.check(student1.Average(), student2.Average());
     
       student student3 = new student("saad", array2); 
       System.out.println(student3.Average());
    }
    
}
