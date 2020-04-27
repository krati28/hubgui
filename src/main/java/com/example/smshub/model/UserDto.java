package com.example.smshub.model;

public class UserDto {

	private int cluster_id;
	private String cluster_name;
	private int cluster_type;
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
