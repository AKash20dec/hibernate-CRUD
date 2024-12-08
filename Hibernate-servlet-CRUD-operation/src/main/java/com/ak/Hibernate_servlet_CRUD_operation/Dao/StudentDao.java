package com.ak.Hibernate_servlet_CRUD_operation.Dao;

import java.time.LocalDate;

import com.ak.Hibernate_servlet_CRUD_operation.entity.Student;
import com.ak.Hibernate_servlet_CRUD_operation.service.HibernateUtils;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class StudentDao {
	EntityManager em =HibernateUtils.getEntityManager();
	EntityTransaction et = em.getTransaction();

	 public void saveUser(Student student) {
		 
		 student = new Student(101, "priyank",LocalDate.parse("2003-02-22"), "priyank@gmail.com");
		 et.begin();
		 em.persist(student);
		 et.commit();
		 
	 }
	 public void updateUser(Student student) {
		 
		Student std =  em.find(Student.class, 123);
		if(std!=null) {
			std.setName("Akash");
			et.begin();
			em.merge(std);
			et.commit();
		} 
		else{
			System.out.println("The given id is not present");
		}
	 }
	 
	 public void deleteUser(Student student) {
		 Student std =  em.find(Student.class, 123);
			if(std!=null) {
				
				et.begin();
				em.remove(std);
				et.commit();
			} 
			else{
				System.out.println("The given id is not present");
			}
	 }
}
