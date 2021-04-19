package l8hac;

import java.util.Date;

public class L8HAcRUNNER {

    public static void main(String[] args) {
        
        Person first_person = new Person("saada", "house 256 street 2", "213-55-455", "saadm865@gmail.com");
        Student first_student = new Student("saada", "house 256 street 2", "213-55-455", "saadm865@gmail.com", "good");
        Date date = new Date(2001, 2, 3);
        Employee first_employee = new Employee("saada", "house 256 street 2", "213-55-455", "saadm865@gmail.com", " room 3",
                23000, date);
        Faculty first_faculty = new Faculty("saada", "house 256 street 2", "213-55-455", "saadm865@gmail.com", " room 3",
                23000, date, 21, "officer");
        Staff first_staff = new Staff("saada", "house 256 street 2", "213-55-455", "saadm865@gmail.com", " room 3",
                23000, date, "the teflon don");
        
        first_person.Display();
        first_student.Display();
        first_employee.Display();
        first_faculty.Display();
        first_staff.Display();
        
    }
    
}
