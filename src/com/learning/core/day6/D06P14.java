package com.learning.core.day6;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employee(int id, String name, String department, String designation) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return id + " " + name + "\n" + department + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class D06P14 {
    public static void main(String[] args) {
        // Predefined employee details
        Employee[] employees = {
            new Employee(1006, "Henry", "Accountant", "Finance"),
            new Employee(1005, "Charles", "QA Lead", "Testing"),
            new Employee(1004, "Grace", "Tech Support", "HR"),
            new Employee(1003, "Robert", "Product Manager", "Development"),
            new Employee(1002, "Thomas", "Tester", "Testing"),
            new Employee(1001, "Daniel", "Analyst", "L&D")
        };

        // Storing employee details in a HashTable using id as key
        Hashtable<Integer, Employee> employeeHashtable = new Hashtable<>();
        for (Employee employee : employees) {
            employeeHashtable.put(employee.hashCode(), employee);
        }

        // Adding employee details from a current collection
        Collection<Employee> currentCollection = new ArrayList<>();
        currentCollection.add(new Employee(1007, "Sarah", "Developer", "Development"));
        currentCollection.add(new Employee(1008, "Emily", "HR Assistant", "HR"));

        for (Employee employee : currentCollection) {
            employeeHashtable.put(employee.hashCode(), employee);
        }

        // Outputting employee details
        for (Map.Entry<Integer, Employee> entry : employeeHashtable.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }
}