package com.tka.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientSelect {
	public static void main(String[] args) {
		  
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Candidate candidate = new Candidate(3,"Pranav","BJP","Nagpur","MH","Male",24);
		session.save(candidate);
        //Candidate object = session.load(Candidate.class, 1);
       //System.out.println(object);
       
       //Candidate object2 = session.load(Candidate.class, 2);
       //System.out.println(object2);
	}

}
