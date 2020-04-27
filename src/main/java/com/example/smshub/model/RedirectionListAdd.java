package com.example.smshub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "rllisttable" )
public class RedirectionListAdd {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	@Column 
	private String listname;
	@Column
	private String listtype;
	@Column
	private String loadDistributionType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getListname() {
		return listname;
	}
	public void setListname(String listname) {
		this.listname = listname;
	}
	public String getListtype() {
		return listtype;
	}
	public void setListtype(String listtype) {
		this.listtype = listtype;
	}
	public String getLoadDistributionType() {
		return loadDistributionType;
	}
	public void setLoadDistributionType(String loadDistributionType) {
		this.loadDistributionType = loadDistributionType;
	}
	
	
}
