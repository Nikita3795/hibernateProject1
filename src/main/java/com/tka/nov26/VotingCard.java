package com.tka.nov26;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class VotingCard {
    @Id
    private String voterId;
    private String constituency;

    @OneToOne(mappedBy = "votingCard", cascade = CascadeType.ALL)
    private Person person;

    // Constructor
    public VotingCard(String voterId, String constituency) {
        this.voterId = voterId;
        this.constituency = constituency;
    }

    public VotingCard() {}

    // Getters and Setters
    public String getVoterId() {
        return voterId;
    }

    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

