package com.tka.nov26;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Person {
    @Id
    private int aadharId;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "voter_id", referencedColumnName = "voterId", unique = true)
    private VotingCard votingCard;

    @ManyToOne
    @JoinColumn(name = "address_pincode")
    private Address address;

    // Constructor
    public Person(int aadharId, String name, VotingCard votingCard, Address address) {
        this.aadharId = aadharId;
        this.name = name;
        this.votingCard = votingCard;
        this.address = address;
    }

    public Person() {}

    // Getters and Setters
    public int getAadharId() {
        return aadharId;
    }

    public void setAadharId(int aadharId) {
        this.aadharId = aadharId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VotingCard getVotingCard() {
        return votingCard;
    }

    public void setVotingCard(VotingCard votingCard) {
        this.votingCard = votingCard;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

