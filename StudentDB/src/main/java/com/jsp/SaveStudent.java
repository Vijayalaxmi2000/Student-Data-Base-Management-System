package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Student student=new Student();
		
		student.setId(101);
		student.setAge(21);
		student.setName("Viraj");
		student.setPhNo(984571020);
		student.setMarks(95);
		
		Student student1=new Student();
		student1.setId(102);
		student1.setAge(22);
		student1.setName("Vijay");
		student1.setPhNo(807310900);
		student1.setMarks(97);

		Student student2=new Student();
		student2.setId(103);
		student2.setAge(21);
		student2.setName("Vinuta");
		student2.setPhNo(984571480);
		student2.setMarks(95);

		Student student3=new Student();
		student3.setId(104);
		student3.setAge(21);
		student3.setName("Amul");
		student3.setPhNo(984572420);
		student3.setMarks(95);

		Student student4=new Student();
		student4.setId(105);
		student4.setAge(21);
		student4.setName("Arav");
		student4.setPhNo(984545020);
		student4.setMarks(95);

		
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(student4);
		entityTransaction.commit();
		
	} 

}
