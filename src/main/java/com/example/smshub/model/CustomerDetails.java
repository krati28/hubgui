package com.example.smshub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "customer_details")
public class CustomerDetails {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customer_id;
	
	@Column(length=50)
	private String name;
	
	@Column(length=5) 
	private String operator_type;
	
	@Column(length = 2)
	private String enterprise;

	public String getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOperator_type() {
		return operator_type;
	}

	public void setOperator_type(String operator_type) {
		this.operator_type = operator_type;
	}
	
	
}