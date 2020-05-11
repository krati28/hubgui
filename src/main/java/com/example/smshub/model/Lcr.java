package com.example.smshub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table (name = "lcr_data")
public class Lcr {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(columnDefinition = "integer(10)")
	private int lcr_policy_id;
	
	@Column(length=30)
	@NotBlank
	@Pattern(regexp ="^[a-zA-Z0-9_]+$", message="Invalid entry")
	private String lcr_name;
	
	@Column(length=30)
	private String lcr_type;
	
	@Column(columnDefinition = "integer(1)")
	private int third_supp_retry;

	public int getThird_supp_retry() {
		return third_supp_retry;
	}

	public void setThird_supp_retry(int third_supp_retry) {
		this.third_supp_retry = third_supp_retry;
	}

	public int getLcr_policy_id() {
		return lcr_policy_id;
	}

	public void setLcr_policy_id(int lcr_policy_id) {
		this.lcr_policy_id = lcr_policy_id;
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
