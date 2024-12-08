package com.ak.Hibernate_servlet_CRUD_operation.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtils {

	public static EntityManager getEntityManager()  {
		EntityManager emf =Persistence.createEntityManagerFactory("hibernate").createEntityManager();
		
		return emf;
	}
}
