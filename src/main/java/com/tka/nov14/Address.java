 package com.tka.nov14;

 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.GenerationType;
 import javax.persistence.Id;
 import javax.persistence.OneToOne;

 @Entity
 public class Address {

 @Id	
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String city;
 private String state;
 private int pin;

 @OneToOne(mappedBy="address")
 private Student student;
 public Address() {
 	super();
 	
 }
 public Address( String city, String state, int pin) {
 	super();
 	
 	this.city = city;
 	this.state = state;
 	this.pin = pin;
 }
 public int getId() {
 	return id;
 }
 public void setId(int id) {
 	this.id = id;
 }
 public String getCity() {
 	return city;
 }
 public void setCity(String city) {
 	this.city = city;
 }
 public String getState() {
 	return state;
 }
 public void setState(String state) {
 	this.state = state;
 }
 public int getPin() {
 	return pin;
 }
 public void setPin(int pin) {
 	this.pin = pin;
 }
 @Override
 public String toString() {
 	return "Address [id=" + id + ", city=" + city + "]";
 }

 }