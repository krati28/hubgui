package com.example.smshub.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

//import org.springframework.data.annotation.Id;

@Entity
@Table(name= "user" )
public class User {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(columnDefinition = "BIGINT(10)")
	private int cluster_id;
	
	@Column(length=21)
	@NotBlank
	@Pattern(regexp ="^[a-zA-Z0-9_]+$", message="Invalid entry")
	private String cluster_name;
	
	@Column(columnDefinition = "integer(1)")
	private int cluster_type;

	@Column
	private String operator_ids;
	
	public String getOperator_ids() {
		return operator_ids;
	}

	public void setOperator_ids(String operator_ids) {
		this.operator_ids = operator_ids;
	}

	public int getCluster_id() {
		return cluster_id;
	}

	public void setCluster_id(int cluster_id) {
		this.cluster_id = cluster_id;
	}

	public String getCluster_name() {
		return cluster_name;
	}

	public void setCluster_name(String cluster_name) {
		this.cluster_name = cluster_name;
	}

	public int getCluster_type() {
		return cluster_type;
	}

	public void setCluster_type(int cluster_type) {
		this.cluster_type = cluster_type;
	}
	
}
