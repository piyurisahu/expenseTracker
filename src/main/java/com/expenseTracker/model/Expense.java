package com.expenseTracker.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String item;
	private float amount;
	private String description;
	
	public Expense() {
		
	}
	public Expense(String item, float amount, String description) {
		this.item = item;
        this.amount = amount;
        this.description = description;
	}

	public long getId() {
		return id;
	}

	
	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
