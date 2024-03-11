package com.learning.core.day6;

import java.util.Hashtable;

class Employee2 
{
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee2(int id, String name, String department, String designation) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() 
    {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 Employee2 = (Employee2) o;
        return id == Employee2.id;
    }

    @Override
    public int hashCode() 
    {
        return id;
    }
}

public class D06P13 
{
    public static void main(String[] args) 
    {
        Hashtable<Integer, Employee2> Employee2Hashtable = new Hashtable<>();

       
        Employee2 emp1 = new Employee2(1, "John Doe", "Engineering", "Software Engineer");
        Employee2 emp2 = new Employee2(2, "Jane Smith", "Marketing", "Marketing Manager");
        Employee2 emp3 = new Employee2(3, "Alice Johnson", "HR", "HR Manager");
        Employee2 emp4 = new Employee2(4, "Bob Brown", "Finance", "Financial Analyst");
        Employee2 emp5 = new Employee2(5, "James Bond", "Development", "Product Manager");

       
        Employee2Hashtable.put(emp1.hashCode(), emp1);
        Employee2Hashtable.put(emp2.hashCode(), emp2);
        Employee2Hashtable.put(emp3.hashCode(), emp3);
        Employee2Hashtable.put(emp4.hashCode(), emp4);
        Employee2Hashtable.put(emp5.hashCode(), emp5);

        
        System.out.println(Employee2Hashtable.size());
    }
}