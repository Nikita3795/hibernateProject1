package com.tka.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ClientInsert {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Candidate.class);
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Candidate candidate = new Candidate(3,"Devendra","BJP","MH","Nagpur East","Male",56);
        
        Student studentobj = new Student("vijay",44);
        Address studentaddress = new Address ("Pune","MH",909);
        studentobj.setAddress(studentaddress);
         
        session.save(candidate);
        
        transaction.commit();
        session.close();
        
	}

	

}
