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
import com.sun.istack.NotNull;

@Entity
@Table (name = "path_data")

public class PathDetails {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(columnDefinition = "BIGINT(10)")
	private int path_id;
	
	@Column(length=30)
	@NotBlank
	@Pattern(regexp ="^[a-zA-Z0-9_]+$", message="Invalid entry")
	private String path_name;
	
	@Column(length=10)
	private String interface_type;
	
	@Column(columnDefinition = "integer(1)")
	private int oc_compliance_flag;

//	@Column(columnDefinition= "integer(5")
//	private int supplier_id;
//	
//	public int getSupplier_id() {
//		return supplier_id;
//	}
//
//	public void setSupplier_id(int supplier_id) {
//		this.supplier_id = supplier_id;
//	}

	public int getPath_id() {
		return path_id;
	}

	public void setPath_id(int path_id) {
		this.path_id = path_id;
	}

	public String getPath_name() {
		return path_name;
	}

	public void setPath_name(String path_name) {
		this.path_name = path_name;
	}

	public String getInterface_type() {
		return interface_type;
	}

	public void setInterface_type(String interface_type) {
		this.interface_type = interface_type;
	}

	public int getOc_compliance_flag() {
		return oc_compliance_flag;
	}

	public void setOc_compliance_flag(int oc_compliance_flag) {
		this.oc_compliance_flag = oc_compliance_flag;
	}

}
