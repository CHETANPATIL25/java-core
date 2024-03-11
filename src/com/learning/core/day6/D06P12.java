package com.learning.core.day6;

import java.util.Hashtable;

class Employe1 
{
    private int id;
    private String name;
    private String department;
    private String designation;

    public Employe1(int id, String name, String department, String designation) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.designation = designation;
    }

    @Override
    public String toString() 
    {
        return id + " " + name + " "+designation+ " " + department;
    }

    @Override
    public int hashCode() 
    {
        return id;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe1 Employe1 = (Employe1) obj;
        return id == Employe1.id;
    }
}

public class D06P12 
{
    private static final int Integer = 0;
	private static final String List = null;
	private static final int Map = 0;

	public static void main(String[] args) 
	{
        Hashtable<Integer, Employe1> Employe1Hashtable = new Hashtable<>();

       
        Employe1 emp1 = new Employe1(1001, "Daniel", "L&D", "Analyst");
        Employe1 emp2 = new Employe1(1002, "Thomas", "", "Tester");
        Employe1 emp3 = new Employe1(1003, "Robert", "Development", "Product Manager");
        Employe1 emp4 = new Employe1(1004, "Grace", "HR", "Tech Support");

        
        Employe1Hashtable.put(emp1.hashCode(), emp1);
        Employe1Hashtable.put(emp2.hashCode(), emp2);
        Employe1Hashtable.put(emp3.hashCode(), emp3);
        Employe1Hashtable.put(emp4.hashCode(), emp4);

       
        addEmploye1IfNotExists(Employe1Hashtable, 1005, "Charles", "Lead Testing","QA");

        
        for (Employe1 emp : Employe1Hashtable.values()) {
            System.out.println(emp);
        }
    }

    private static void addEmploye1IfNotExists(Hashtable<Integer, Employe1> Employe1Hashtable,int id, String name, String department, String designation) 
    {
        Employe1 newEmploye1 = new Employe1(id, name, department, designation);
        if (!Employe1Hashtable.containsKey(id))
        {
            Employe1Hashtable.put(id, newEmploye1);
        }
      
    }
}