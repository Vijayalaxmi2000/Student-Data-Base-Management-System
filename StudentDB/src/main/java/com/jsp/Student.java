package com.jsp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int id;
	private String name;
	private int age;
	private long phNo;
	private double marks;
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
	public long getPhNo() 
	{
		return phNo;
	}
	public void setPhNo(long phNo) 
	{
		this.phNo = phNo;
	}
	public double getMarks() 
	{
		return marks;
	}
	public void setMarks(double marks) 
	{
		this.marks = marks;
	}
	
	
}
