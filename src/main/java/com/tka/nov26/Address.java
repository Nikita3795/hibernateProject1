package com.tka.nov26;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Address {
    @Id
    private int pincode;
    private String cityName;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)//database operation in orms
    private List<Person> persons;

    public Address(int pincode, String cityName) {
        this.pincode = pincode;
        this.cityName = cityName;
    }

    public Address() {}

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}

