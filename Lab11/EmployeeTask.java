package l11ac1;

public class EmployeeTask implements RegisterForExams{
   
private String name;
private String date;
private int salary;

public EmployeeTask(){
name = null;
date = null;
salary = 0;
}

public EmployeeTask(String name,String date,int salary){
this.name = name;
this.date = date;
 this.salary = salary;
}

public void register(){
System.out.println("Name " + name + " salary " + salary + " Employee " 
       +  " reistered on date " + date);
}
    
    
}
