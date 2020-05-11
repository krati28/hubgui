package com.example.smshub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

@Entity
@Table(name="pointcode_details")

public class PointCodeDetails {
                @Id
                @GeneratedValue(strategy= GenerationType.IDENTITY)
                private int ptcode_id;
                
                @Column(length=11)
                //@NotBlank(message = "Point Code  is mandatory")
                @Positive(message="Only Positive values are allowed for Point Code")
                private int point_code;
                
                
                @Column(length=50)
                @NotBlank(message = "Operator Name is mandatory")
                @Pattern(regexp ="^([A-Za-z])(\\s*)([A-Za-z0-9\\_\\-\\s]*)$", message="Invalid entry")
                private String operator_name;
                
                @Column(length=50)
                @NotBlank(message = "Operator Country is mandatory")
                @Pattern(regexp ="^([A-Za-z])(\\s*)([A-Za-z\\_\\-\\s]*)$", message="Invalid entry")
                private String operator_country;
                
                @Column(columnDefinition = "integer(2)")
                @Min(0)
                @Max(255)
                //@NotBlank(message = "SAP Id  is mandatory")
                @Positive(message="Only Positive values are allowed for SAP Id")
                private int sap_id;
                
                @Column(columnDefinition = "SMALLINT(2)")
                @Min(0)
                @Max(255)
                //@NotBlank(message = "TT is mandatory")
                @Positive(message="Only Positive values are allowed for TT") 
                private int tt;
                
                @Column(columnDefinition = "SMALLINT(2)")
                private int np;
                
                @Column(columnDefinition = "SMALLINT(2)")
                private int ssn;
                
                
                @Column(columnDefinition ="varchar(2) default 'I'")
                private String status;
                
                
                @Column(columnDefinition="integer(12)")
                private int status_time;
                
                
                @Column(columnDefinition ="integer(5) default '0'")
                private int delay;
                
                @Column(columnDefinition ="integer(1) default '0'")
                private int ri;

                
                public int getPtcode_id() {
                                return ptcode_id;
                }
                public void setPtcode_id(int ptcode_id) {
                                this.ptcode_id = ptcode_id;
                }
                public int getPoint_code() {
                                return point_code;
                }
                public void setPoint_code(int point_code) {
                                this.point_code = point_code;
                }
                public String getOperator_name() {
                                return operator_name;
                }
                public void setOperator_name(String operator_name) {
                                this.operator_name = operator_name;
//                            operatorname=operator_name;
                }
                public String getOperator_country() {
                                return operator_country;
                }
                public void setOperator_country(String operator_country) {
                                this.operator_country = operator_country;
                }
                public int getSap_id() {
                                return sap_id;
                }
                public void setSap_id(int sap_id) {
                                this.sap_id = sap_id;
                }
                public int getTt() {
                                return tt;
                }
                public void setTt(int tt) {
                                this.tt = tt;
                }
                public int getNp() {
                                return np;
                }
                public void setNp(int np) {
                                this.np = np;
                }
                public int getSsn() {
                                return ssn;
                }
                public void setSsn(int ssn) {
                                this.ssn = ssn;
                }
                public String getStatus() {
                                return status;
                }
                public void setStatus(String status) {
                                this.status = status;
                }
                public int getStatus_time() {
                                return status_time;
                }
                public void setStatus_time(int status_time) {
                                this.status_time = status_time;
                }
                public int getDelay() {
                                return delay;
                }
                public void setDelay(int delay) {
                                this.delay = delay;
                }
                public int getRi() {
                                return ri;
                }
                public void setRi(int ri) {
                                this.ri = ri;
                }


}
