package mtest;


public class EmployeeTest {

    public static void main(String args[]){
        Employee emp1 = new Employee("1");
        Employee emp2 = new Employee("2");

        emp1.setAge(26);
        emp1.setDesignation("CTO");
        emp1.setSalary(5555555.36);
        emp1.printEmployee();
    }
}
