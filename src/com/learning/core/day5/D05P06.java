package com.learning.core.day5;
import java.util.HashSet;
import java.util.TreeSet;

class Person implements Comparable<Person> 
{
	  private int id;
	  private String name;
	  private int age;
	  private double salary;

	  public int getId() 
	  {
		return id;
	  }

	  public void setId(int id) 
	  {
		this.id = id;
	  }
	
	  public String getName() 
	  {
		return name;
	  }
	
	  public void setName(String name) 
	  {
		this.name = name;
	  }
	
	  public int getAge() 
	  {
		return age;
	  }

	  public void setAge(int age) 
	  {
		this.age = age;
	  }
	
	  public double getSalary() 
	  {
		return salary;
	  }
	
	  public void setSalary(double salary) 
	  {
		this.salary = salary;
	  }
	
	 public Person(int id, String name, int age, double salary) 
	 {
		    this.id = id;
		    this.name = name;
		    this.age = age;
		    this.salary = salary;
	 }
	
	
	 public int compareTo(Person other) 
	 {
		 return Integer.compare(this.id, other.id); // Natural sorting by id
	 }
	
		  
	 public String toString() 
	 {
	    return "Id:" + id + ", name=" + name + ", age=" + age + ", salary=" + salary;
	 }
	
	 public int hashCode() 
	 {
		    final int prime = 31;
		    int result = 1;
		    result = prime * result + id;
		    return result;
	 }
		  
	 public boolean equals(Object obj) 
	 {
		    if (this == obj)
		      return true;
		    if (obj == null)
		      return false;
		    if (getClass() != obj.getClass())
		      return false;
		    Person other = (Person) obj;
		    if (id != other.id)
		      return false;
		    return true;
	 }
}
	
public class D05P06 
{
	
		  public static void main(String[] args) 
		  {
		    TreeSet<Person> people = new TreeSet<>();
	
		    people.add(new Person(1, "Alice", 22, 1500.0));
		    people.add(new Person(2, "Bob", 20, 2200.0));
		    people.add(new Person(3, "Charlie", 21, 1800.0));
		    people.add(new Person(4, "David", 19, 1200.0));
		    people.add(new Person(5, "John", 32, 1999.0));
		    people.add(new Person(6, "Emily", 42, 1600.0));
	
		    for (Person person : people) 
		    {
		      if (person.getAge() > 25) 
		      {
		        System.out.println(person);
		      }
		    }
		  }
}