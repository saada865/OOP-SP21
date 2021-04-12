package l4hac1;

public class Marks {

private int marks_a;
private int marks_b;
private int marks_c;

Marks(){
}

public void set_firstMarks(int a){
    
    this.marks_a = a;
}
public void set_secondMarks(int b){
    
    this.marks_b = b;
}
public void set_thidMarks(int c){
    
    this.marks_c = c;
}
public int get_firstMarks(){
    
    return marks_a;
    
}
public int get_secondMarks(){
    
    return marks_b;
    
}
public int get_thirdMarks(){
    
    return marks_c;
    
}
    
}
