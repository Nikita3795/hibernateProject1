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

public class ClientCriteria {
	 

		public static void main(String[] args) {
	  
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Candidate.class);
			SessionFactory factory= cfg.buildSessionFactory();
			Session session = factory.openSession();
			
			
			//Select*from Candidate
	       Criteria criteria = session.createCriteria(Candidate.class);
	       
	      // PropertyProjection projection1 = Projections.property("name");
	       PropertyProjection projection2 = Projections.property("partyname");
	       
	       ProjectionList projectionlist =   Projections.projectionList();
	       //projectionlist.add( projection1);
	       projectionlist.add( projection2);
	       
	       //select name from candidate
	     criteria.setProjection(projectionlist);
	      // criteria.setProjection(projection1).setProjection(projection2);
	       
	       // where age > 50
	       
	       
	       criteria.add(Restrictions.eq("age",60));
	       
	       criteria.add(Restrictions.like("partyname" , "NCP"));
	       List list = criteria.list();
	       List<Candidate>listofcandidate=criteria.list();
	      for(Candidate candidate: listofcandidate) {
	    	   System.out.println(candidate);
	       }
	       
		}

	}