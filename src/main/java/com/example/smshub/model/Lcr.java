package com.example.smshub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "lcr_data")
public class Lcr {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int lcr_id;
	
	@Column
	private String lcr_name;
	
	@Column
	private String lcr_type;

	public int getLcr_id() {
		return lcr_id;
	}

	public void setLcr_id(int lcr_id) {
		this.lcr_id = lcr_id;
	}

	public String getLcr_name() {
		return lcr_name;
	}

	public void setLcr_name(String lcr_name) {
		this.lcr_name = lcr_name;
	}

	public String getLcr_type() {
		return lcr_type;
	}

	public void setLcr_type(String lcr_type) {
		this.lcr_type = lcr_type;
	}

}
