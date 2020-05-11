package com.example.smshub.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.*;

@Entity
@Table(name= "deal_details")
public class DealManagement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(length=20)
//	@NotEmpty(message = "Deal Name is mandatory")
	@Pattern(regexp ="^[a-zA-Z _]+$", message="Invalid entry")
	private String name;
	
	@Column(columnDefinition = "integer(2)")
	@Positive(message="Only Positive values are allowed for Validity Period")
//	@NotEmpty(message = "Validity Period is mandatory")
	private int validity_prd;
	
	@Column
//	@NotEmpty(message = "Start Date is mandatory")
	@FutureOrPresent(message = "Invalid date entered")
	private Date start_date;
	
	@Column(length=10)		//ye db mai char type ka hai
//	@NotEmpty(message = "Deal Rate is mandatory")
//	@PositiveOrZero(message="Only positive or zero value acceptable for Rate")
	private int rate;
	
	@Column(columnDefinition = "integer(1)")
//	@NotEmpty(message = "Deal Type is mandatory")
	private int type;
	
	@Column(columnDefinition = "integer(1)")
//	@NotEmpty(message = "Deal Options is mandatory")
	private int options;
	
	@Column
//	@NotEmpty(message = "Deal Value is mandatory")
	@PositiveOrZero(message="Only positive or zero value acceptable for Value")
	private double value;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValidity_prd() {
		return validity_prd;
	}
	public void setValidity_prd(int validity_prd) {
		this.validity_prd = validity_prd;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getOptions() {
		return options;
	}
	public void setOptions(int options) {
		this.options = options;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
}