package com.dhathika.pojo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Student std = new Student(238,"bibin2","john2");
		Session session = null;
				session = SessionUtil.getSession();
						session.getTransaction().begin();
						session.save(std);
						session.getTransaction().commit();
					SessionUtil.closeSession(session);

		
		
		

	}

}
