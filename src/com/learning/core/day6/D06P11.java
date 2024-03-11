package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Objects;

class Emp 
{
    private int id;
    private String name;
    private String department;
    private String designation;

    public Emp(int id, String name, String department, String designation) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() 
    {
        return String.format("%d %s %s %s", id, name, department, designation);
    }

    @Override
    public boolean equals(Object o) 
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp Emp = (Emp) o;
        return id == Emp.id;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(id);
    }
}

class D06P11 
{
    public static void main(String[] args) 
    {
        Hashtable<Integer, Emp> Emps = new Hashtable<>();

        Emps.put(1001, new Emp(1001, "Daniel", "Analyst", "L&D"));
        Emps.put(1002, new Emp(1002, "Thomas", "Tester", "Testing"));
        Emps.put(1003, new Emp(1003, "Robert", "Product Manager", "Development"));
        Emps.put(1004, new Emp(1004, "Grace", "Tech Support", "HR"));

        int searchId = 1003;

        Emp foundEmp = Emps.get(searchId);
        if (foundEmp != null) 
        {
            System.out.println(foundEmp);
        } 
        else 
        {
            System.out.println("Emp with ID " + searchId + " not found.");
        }
    }
}