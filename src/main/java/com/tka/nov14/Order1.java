
package com.tka.nov14;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Order1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	private String nm;
	private int price;
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "s_id",referencedColumnName="roll")
	//private Student student;

	public Order1() {
		super();

	}

	public Order1(String nm, int price) {
		super();

		this.nm = nm;
		this.price = price;
	}

	//public Order1(String nm, int price, Student student) {
		//super();
		//this.nm = nm;
		//this.price = price;
		//this.student = student;
	//}

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getNm() {
		return nm;
	}

	public void setNm(String nm) {
		this.nm = nm;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "StudentOrder [oid=" + oid + ", nm=" + nm + ", price=" + price + "]";
	}
	}
