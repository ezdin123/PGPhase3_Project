package com.sportyshoess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Shoe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Category")
	private String category;
	@Column(name = "Price")
	private double price;

	public Shoe() {
		super();
	}

	public Shoe(int id, String name, String category, double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("Shoe [id=%s, name=%s, category=%s, price=%s]", id, name, category, price);
	}

}
