package com.example.smshub.model;

public class LcrDto {
	

	private int lcr_policy_id;
	private String lcr_name;
	private String lcr_type;
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
