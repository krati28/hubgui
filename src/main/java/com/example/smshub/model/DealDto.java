package com.example.smshub.model;

import java.util.Date;

public class DealDto {
	private int id;
	private String name;
	private int validity_prd;
	private Date start_date;
	private int rate;
	private int type;
	private int options;
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