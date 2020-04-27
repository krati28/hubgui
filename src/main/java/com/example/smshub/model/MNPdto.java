package com.example.smshub.model;

public class MNPdto {

       private int mnp_id;
       private String mnp_type;
       private String gateway_name;
       private String config;
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

