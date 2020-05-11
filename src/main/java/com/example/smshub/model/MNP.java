package com.example.smshub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="mnp")
public class MNP {
                
                @Id
                @GeneratedValue(strategy= GenerationType.IDENTITY)
                private int mnp_id;
                
                @Column(columnDefinition = "varchar(10)")
                @NotBlank(message = "MNP Type is mandatory")
                //@Pattern(regexp ="^[a-zA-Z _]+$", message="Invalid entry")
                private String mnp_type;
                
                @Column(columnDefinition = "varchar(15)",unique=true)
                @NotBlank(message = "Gateway Name is mandatory")
                @Pattern(regexp ="^([A-Za-z])(\\s*)([A-Za-z0-9\\_\\-\\s]*)$", message="Invalid entry")
                private String gateway_name;
                
                @Column(columnDefinition = "varchar(512)")
               // @NotBlank(message = "Config is mandatory")
                private String config;
                
                 @Column(columnDefinition = "varchar(15)")
                private String cache_name;

                public int getMnp_id() {
                      return mnp_id;
                }

                public void setMnp_id(int mnp_id) {
                      this.mnp_id = mnp_id;
                }

                public String getMnp_type() {
                       return mnp_type;
                }

                            public void setMnp_type(String mnp_type) {
                        this.mnp_type = mnp_type;
                            }

                public String getGateway_name() {
                                return gateway_name;
                }

                public void setGateway_name(String gateway_name) {
                                this.gateway_name = gateway_name;
                }

                public String getConfig() {
                                return config;
                }

                public void setConfig(String config) {
                                this.config = config;
                }

                public String getCache_name() {
                                return cache_name;
                }

                public void setCache_name(String cache_name) {
                                this.cache_name = cache_name;
                }
                

}
