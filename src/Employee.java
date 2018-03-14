import java.io.*;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // Emloyree 的构造器
    public Employee(String name) {
        this.name = name;
    }

    // set age

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void printEmployee() {
        System.out.println("名称:" + name);
        System.out.println("年龄:" + age);
        System.out.println("职位:" + designation);
        System.out.println("薪水:" + salary);
    }
}
