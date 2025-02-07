package com.tka.nov14;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class ClientDelete {
		public static void main(String[] args) {
			Configuration cfg = new Configuration();
		    cfg.configure();
		    cfg.addAnnotatedClass(Candidate.class);
		    SessionFactory factory = cfg.buildSessionFactory();
		    Session session = factory.openSession();
		    Transaction transaction = session.beginTransaction();
		    Candidate candidate = new Candidate(3,"Devendra","BJP","MP","Jabalpur","Male",56);
		    session.delete(candidate);
		    transaction.commit();
		    session.close();
		    

		}


}
