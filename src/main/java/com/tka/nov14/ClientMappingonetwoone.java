package com.tka.nov14;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientMappingonetwoone {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg2.xml");
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Address.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Student s1 = new Student("jay", 88);
		Address add = new Address("Pune", "MH", 402);

		Student s2 = new Student("nikita", 89);
		Address add2 = new Address("Mumbai", "MH", 408);

		s1.setAddress(add);
		s2.setAddress(add2);
		// It will create records in both the table.
		session.save(s1);
		session.save(s2);

		transaction.commit();
		session.close();

	}

}
