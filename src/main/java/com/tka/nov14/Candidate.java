package com.tka.nov14;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
   @Entity
   @Table(name="candidate", schema="candidate")
   
	 	public class Candidate implements Serializable {
		
	       @Id
	       @Column (name = "c_id")
			private int c_id;
			private String cname;
			private String partyname;
			private String assemnly;
			private String state;
			private String gender;
			private int age;

			public Candidate() {
				super();
				 
			}
			

			public Candidate(int c_id, String cname, String partyname, String assemnly, String state, String gender, int age) {
				super();
				this.c_id = c_id;
				this.cname = cname;
				this.partyname = partyname;
				this.assemnly = assemnly;
				this.state = state;
				this.gender = gender;
				this.age = age;
			}

			public int getC_id() {
				return c_id;
			}

			public void setC_id(int c_id) {
				this.c_id = c_id;
			}

			public String getCname() {
				return cname;
			}

			public void setCname(String cname) {
				this.cname = cname;
			}

			public String getPartyname() {
				return partyname;
			}

			public void setPartyname(String partyname) {
				this.partyname = partyname;
			}

			public String getAssemnly() {
				return assemnly;
			}

			public void setAssemnly(String assemnly) {
				this.assemnly = assemnly;
			}

			public String getState() {
				return state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getGender() {
				return gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			@Override
			public String toString() {
				return "candidate [cname=" + cname + ", partyname=" + partyname + ", assemnly=" + assemnly + "]";
			}

		}



	

