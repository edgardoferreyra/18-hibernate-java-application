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
	}
	
}
