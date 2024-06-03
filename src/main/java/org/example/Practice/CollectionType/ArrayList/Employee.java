package org.example.Practice.CollectionType.ArrayList;

public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public void SetName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void SetAge(int age){
        this.age=age;
    }
    public static void main(String[] args){
        Employee emp=new Employee("John Doe", 20);
        System.out.println(emp.name+" "+emp.age);
        emp.SetAge(21);
        System.out.println(emp.age);
    }
}

