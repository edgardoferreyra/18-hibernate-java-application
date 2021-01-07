package org.studyeasy.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.hibernate.entity.Users;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		/* Save a record from a database with hibernate
		 
		try {
			//1-Create object of entity class type
			Users user = new Users("username","password","firstName","lastName");			
			//2-Start transaction
			session.beginTransaction();
			//3-Perform operation
			session.save(user);
			//4-Commit the transaction
			session.getTransaction().commit();
			System.out.println("Row added!");
			
		}finally {
			session.close();
			factory.close();
		}
		
		*/
		
		/*Retriving a record from a database with hibernate
		 
		 
		try {
			//1-Create object of entity class type
			Users user = new Users();			
			//2-Start transaction
			session.beginTransaction();
			//3-Perform operation
			user = session.get(Users.class, 8); // devuelve el registro del id número 8
			//4-Commit the transaction
			session.getTransaction().commit();
			System.out.println(user.toString());
			
		}finally {
			session.close();
			factory.close();
		}
		
		*/
		
		/*Updating a field from a record in database with hibernate
		
		try {
			//1-Create object of entity class type
			Users user = new Users();			
			//2-Start transaction
			session.beginTransaction();
			//3-Perform operation
			user = session.get(Users.class, 8); // devuelve el registro del id número 8
				//3.1-Updating object
			user.setUsername("Dariel");
			
			//4-Commit the transaction
			session.getTransaction().commit();
			System.out.println(user.toString());
			
		}finally {
			session.close();
			factory.close();
		}
		
		*/
		
		//Deleting a record from database with hibernate
		
		try {
			//1-Create object of entity class type
			Users user = new Users();			
			//2-Start transaction
			session.beginTransaction();
			//3-Perform operation
			user = session.get(Users.class, 8); // devuelve el registro del id número 8
			//3.1-Deleting a record with user id 8
			session.delete(user);
			
			//4-Commit the transaction
			session.getTransaction().commit();
			System.out.println(user.toString());
			
		}finally {
			session.close();
			factory.close();
		}
		
		
	}
	
}
