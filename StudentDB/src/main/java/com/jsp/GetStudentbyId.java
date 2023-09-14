package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class GetStudentbyId 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Student student=entityManager.find(Student.class, 103);
		
		System.out.println(student.getId());
		System.out.println(student.getAge());
		System.out.println(student.getName());
		System.out.println(student.getMarks());
		System.out.println(student.getPhNo());
	
	}
	

}
