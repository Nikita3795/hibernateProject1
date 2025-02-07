 package com.tka.nov26;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
    	
        try {
            // Case 1: Invalid Input (Duplicate voterID)
            Address kpune = new Address(411052, "Karve Pune");
            
            VotingCard tms = new VotingCard("TMS1234", "Kothrud - Pune");
            Person p1 = new Person(6242, "Tejas Saraf", tms, kpune);

            VotingCard ars = new VotingCard ("ARS5678", "Kothrud - Pune"); 
            Person p2 = new Person(1232, "Atul Raut", ars, kpune);

            VotingCard tka = new VotingCard ("TKA6789", "Kothrud - Pune");
            Person p3 = new Person(5678, "Kiran Digrase", tka, kpune);
            
            VotingCard jbk = new VotingCard ("JBK6780", "Kothrud - Pune");
            Person p4 = new Person(5677, "Nikita Pawar", jbk, null);
            
            PersonService.addPerson(p1);
            PersonService.addPerson(p2);  
            PersonService.addPerson(p3);
            PersonService.addPerson(p4);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Case 2: Valid Input
            Address kpune = new Address(411052, "Karve Pune");
            
            VotingCard tms = new VotingCard("TMS1234", "Kothrud - Pune");
            VotingCard ars = new VotingCard("ARS1234", "Kothrud - Pune");
            VotingCard tka = new VotingCard("TKA6789", "Kothrud - Pune");
            VotingCard jbk = new VotingCard("JBK6780", "Kothrud - Pune");
            
            
            Person p1 = new Person(6242, "Tejas Saraf", tms, kpune);
            Person p2 = new Person(1232, "Atul Raut", ars, kpune);
            Person p3 = new Person(5678, "Kiran Digrase", tka, null);
            Person p4 = new Person(5677, "Nikita Pawar", jbk, null);
            
            PersonService.addPerson(p1);
            PersonService.addPerson(p2);
            PersonService.addPerson(p3);
            PersonService.addPerson(p4);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            // Case 3: Assign Same Address to Multiple Persons
        	 VotingCard tms = new VotingCard("TMS1234", "Kothrud - Pune");
            VotingCard tka = new VotingCard("TKA6789", "Kothrud - Pune");
            VotingCard ars = new VotingCard("ARS5678", "Kothrud - Pune");
            VotingCard jbk = new VotingCard("JBK6780", "Kothrud - Pune");

            Address kpune = new Address(411052, "Karve Pune");
            Person p1 = new Person(6242, "Tejas Saraf", tka, null);
            Person p2 = new Person(1232, "Atul Raut", ars, null);
            Person p3 = new Person(5678, "Kiran Digrase", tka, null);
            Person p4 = new Person(5677, "Nikita Pawar", jbk, null); //jbk is not resolved
            
            
            
            // Assign same address to all persons
            kpune.setPersons(Arrays.asList(p1, p2, p3, p4));

            System.out.println("Data Inserted Successfully. Multiple Persons Assigned to the Same Address.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

