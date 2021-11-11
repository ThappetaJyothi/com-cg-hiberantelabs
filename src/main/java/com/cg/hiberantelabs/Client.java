package com.cg.hiberantelabs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.hiberantelabs.model.Greet;

public class Client {

	public static void main(String[] args) {
		System.out.println("Start");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("abcd");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		tr.begin();

//		
		
		Greet grt2 = new Greet(10,"prema");
		grt2.setMessage("Welcome to JPA!");
		//em.persist(grt);
		//em.persist(grt1);
		em.persist(grt2);
		tr.commit();
		System.out.println("Added greeting to database.");
		em.close();
		//factory.close();
		System.out.println("End");


	}

}