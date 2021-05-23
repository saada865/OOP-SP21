package l9ac2;

public class BasePlusCommEmployee extends commissionEmployee{  
    
    private double salary;
BasePlusCommEmployee(){
salary=48000;
}
BasePlusCommEmployee(String A ,String E ,String B ,double C ,double D , double S){
super(A,E,B,C,D);
salary=S;
}
//overridden method
public double earnings(){
return super.earnings()+salary;
}
public void display(){
super.display();
System.out.println("Salary : "+salary);
}

}
