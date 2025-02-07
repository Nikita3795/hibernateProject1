package com.tka.nov26;

import java.util.HashMap;
import java.util.Map;

public class PersonService {
    private static Map<String, Person> voterIdMap = new HashMap<>();

    public static void addPerson(Person person) throws Exception {
        String voterId = person.getVotingCard().getVoterId();

        // Check if voter ID is already assigned
        if (voterIdMap.containsKey(voterId)) {
            throw new Exception("Data Not Inserted. Cannot Assign Similar voterID.");
        }

        // Add to the map and database
        voterIdMap.put(voterId, person);
        System.out.println("Data Inserted Successfully.");
    }
}
