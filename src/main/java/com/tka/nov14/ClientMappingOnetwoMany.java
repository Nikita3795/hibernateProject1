package com.tka.nov14;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientMappingOnetwoMany {

	 

	 public static void main(String[] args) {
				Configuration cfg = new Configuration();
		        cfg.configure("hibernate.cfg2.xml");
		        cfg.addAnnotatedClass(Student.class);
		        cfg.addAnnotatedClass(Order1.class);
		        cfg.addAnnotatedClass(Address.class);
		        SessionFactory factory = cfg.buildSessionFactory();
		        Session session = factory.openSession();
		        Transaction transaction = session.beginTransaction();
		        
		      Student studentobj= new Student("Pratik",98);
		      Address address = new Address("Pune","MH",3001);
		       studentobj.setAddress(address);
		        Order1 o1 = new Order1("Samosa",20);	       
		        Order1 o2 = new Order1("Sandwitch",70);
		        Order1 o3 = new Order1("Coffee",40);
		        Order1 o4 = new Order1("Mojito",90);
		         List<Order1> l1 = new ArrayList<Order1>();
		         l1.add(o1);
		         l1.add(o2);
		    	 l1.add(o3);
		    	 l1.add(o4);
		    	 studentobj.setOrder(l1);
		    	 
		      session.save(studentobj);
		        transaction.commit();
		        session.close();
	}
}
