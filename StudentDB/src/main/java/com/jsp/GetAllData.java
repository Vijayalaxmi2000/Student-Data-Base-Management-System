package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData
{

	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select v from Student v");
		List<Student> students=query.getResultList();
		for(Student student:students)
		{
			System.out.println("Student Id:"+student.getId());
			System.out.println("Student Name:"+student.getName());
			System.out.println("Student Age:"+student.getAge());
			System.out.println("Student Phone No:"+student.getPhNo());
			System.out.println("Student Marks:"+student.getMarks());
			System.out.println("******************");
		}

	}

}
