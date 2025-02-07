  package com.tka.nov14;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class ClientHQLQuery{
	 

		@SuppressWarnings({ "deprecation", "unchecked" })
		public static void main(String[] args) {
	  
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Candidate.class);
			SessionFactory factory= cfg.buildSessionFactory();
			Session session = factory.openSession();
			
			
			//Select*from Candidate
	      // Criteria criteria = session.createCriteria(Candidate.class);
	       
	      // PropertyProjection projection1 = Projections.property("name");
	       //PropertyProjection projection2 = Projections.property("partyname");
	       
	       //ProjectionList projectionlist =   Projections.projectionList();
	       //projectionlist.add( projection1);
	      //
			//projectionlist.add( projection2);
	       String sql = "select * from candidate";
	       //select * from candidate
	     //criteria.setProjection(projectionlist);
	      // criteria.setProjection(projection1).setProjection(projection2);
	       //@SuppressWarnings("unchecked")
	       // NativeQuery  createsqlQuery = session.createSQLQuery(sql);
	     //   Query createQuery = session.createQuery("from Candidate");
	       Query createQuery = session.createQuery("from Candidate where age > 60"); 
	       //createsqlQuery.list();
	        
	      // List list = criteria.list();
	       
		//List<Object>listofcandidate=createsqlQuery.list();
	       List<Candidate>listofcandidate=createQuery.list();
	      for(Object candidate: listofcandidate) {
	    	   System.out.println(candidate);
	       }
	       
		}

	}