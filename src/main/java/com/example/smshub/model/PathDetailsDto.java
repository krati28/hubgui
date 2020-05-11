package com.example.smshub.model;

public class PathDetailsDto {

	private int path_id;
	private String path_name;
	private String interface_type;
	private int oc_compliance_flag;
//	private int supplier_id;
//	
//	public int getSupplier_id() {
//		return supplier_id;
//	}
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
