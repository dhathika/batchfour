package com.dhathika.pojo;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
	private static org.hibernate.SessionFactory sessionFactory;

	static {
		try {
			sessionFactory = new Configuration().configure("com/dhathika/pojo/hibernate.cfg.xml").buildSessionFactory();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//    public SessionFactory getSF() {
//    	Configuration cfg = new Configuration();
//   	cfg.configure(new File("com/dhathika/pojo/hibernate.cfg.xml"));
//    	cfg.addXML("com/dhathika/pojo/hibernate.cfg.xml");
//    	return cfg.buildSessionFactory();
//    	
//    	
//    }
	private SessionUtil() {
	}

	public static Session getSession() {
		return sessionFactory.openSession();
	}

	public static void closeSession(Session session) {
		if (session != null) {
			session.close();
		}
	}

}
