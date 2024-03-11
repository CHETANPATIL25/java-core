package com.learning.core.day6;

import java.util.Objects;
import java.util.Hashtable;

class Employe 
{
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employe(int id, String name, String department, String designation) 
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
        Employe Employe = (Employe) o;
        return id == Employe.id;
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(id);
    }
}

class D06P14 
{
    public static void main(String[] args) 
    {
        Hashtable<Integer, Employe> currentEmployes = new Hashtable<>();
        currentEmployes.put(1001, new Employe(1001, "Daniel", "Analyst", "L&D"));
        currentEmployes.put(1002, new Employe(1002, "Thomas", "Tester", "Testing"));
        currentEmployes.put(1003, new Employe(1003, "Robert", "Product Manager", "Development"));
        currentEmployes.put(1004, new Employe(1004, "Grace", "Tech Support", "HR"));

        Hashtable<Integer, Employe> existingEmployes = new Hashtable<>();
        existingEmployes.put(1005, new Employe(1005, "Charles", "QA Lead", "Testing"));
        existingEmployes.put(1006, new Employe(1006, "Henry", "Accountant", "Finance"));

        existingEmployes.putAll(currentEmployes);

        for (Employe Employe : existingEmployes.values()) 
        {
            System.out.println(Employe);
        }
    }
}