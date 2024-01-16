package com.luv2code.springboot.demo.mycoolapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
     // @JsonProperty annotation simply used as alias ;
    // @Id is used to set a attribute as primary key
    // @GeneratedValue is used to auto generate primary key or id
    @Id
    @GeneratedValue  (strategy = GenerationType.AUTO )
    @JsonProperty("id")
    private int customerID;
    @JsonProperty("firstName")
    private String customerFirstName;
    @JsonProperty("lastName")
    private  String customerLastName;
    @JsonProperty("email")
    private String customerEmail;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
