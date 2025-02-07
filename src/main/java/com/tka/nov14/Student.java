package com.tka.nov14;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
//@Column(name="s_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	private String name;
	private int marks;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	Address address;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name="roll")
	private List<Order1> order = new ArrayList<Order1>();

	public Student() {
		super();

	}

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public Student(String name, int marks, Address address) {
		super();
		this.name = name;
		this.marks = marks;
		this.address = address;
	}

	
	public List<Order1> getOrder() {
		return order;
	}

	public void setOrder(List<Order1> order) {
		this.order = order;
	}

	public Student(String name, int marks, Address address, List<Order1> order) {
		super();
		this.name = name;
		this.marks = marks;
		this.address = address;
		this.order = order;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}

}