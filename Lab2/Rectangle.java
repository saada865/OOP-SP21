package l2as2;

public class Rectangle {

    float width;
    float length;
    float sides1;
    float sides2;
    float angles1;
    float angles2;

    
    Rectangle(float rWidth, float rLength, float rSides1, float rSides2, float rAngles1, float rAngles2 ){
        
        width = rWidth;
        length = rLength;
        sides1 = rSides1;
        sides2 = rSides2;
        angles1 = rAngles1;
        angles2 = rAngles2;
        
    }
    
    Rectangle(){
        
    }
    
    public void printArea(){
        
        float area = length*width;
        System.out.println("Area is " + area);
        
    }
    
    public void changeLength(int len){
        
        length = len;
        
    }
    public void changeWidth(int wid){
        
        width = wid;
        
    }
    public void checkNegative(float Width, float Length){
        
        boolean check_negative = false;
        
        if((Width < 0) || (Length < 0)){
        
            check_negative = true;
    }
        System.out.println(check_negative);
        
    }
    
    
}
