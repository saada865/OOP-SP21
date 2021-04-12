package l7ac1;

public class employeeRecord {
    
    private int emp_id;
private double salary;
public employeeRecord (){

}
public employeeRecord (int e,double s){

    emp_id = e;
    salary = s;
    
}
public void setEmp_id ( int id)
{
emp_id = id;
}
public int getEmp_id ()
{
return emp_id ;
}
public void setSalary (int sal)
{
salary = sal;
}
public String getSalary ()
{
return "salary is " + salary;

}
}
