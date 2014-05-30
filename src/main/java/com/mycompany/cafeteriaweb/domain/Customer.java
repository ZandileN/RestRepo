/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.domain;

import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Sibakhulu
 */
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String custname;
    private String custLname;
    private int age;
    @Embedded
    Address address;
//    @OneToMany
//    @JoinColumn(name="cust_id" insertable="false" updateable="false")
    private Customer(Builder builder)
    {
        id=builder.id;
        custname=builder.custname;
        custLname =builder.custLname;
        address=builder.address;
        age=builder.age;
    }
    private Customer()
    {
        
    }
   
    
    public static class Builder {

        private long id;
        private String custname;
        private String custLname;
        private Address address;
        private int age;
        
        public Builder (String nme) {
            this.custname = nme;
        }
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
        public Builder lastname(String value){
          custLname= value;
          return this;
        } 
        public Builder Address (Address value){
         address= value;
         return this;
        }
        public Builder Age(int value){
        
        age= value;
        return this;
        }
        
        public Builder copy(Customer cust){
            this.id=cust.getId();
            this.custname=cust.getFirstname();
            this.custLname=cust.getLastname();
            this.address=cust.address;
            this.age=cust.getAge();
            return this;
        }
         public Customer build(){
            return new Customer(this);
        }
    }
    
    public Long getId() {
        return id;
    }
    public String getFirstname() {
        return custname;
    }

    public String getLastname() {
        return custLname;
    }
    public int getAge() {
        return age;
  }
    

    public Address getAddress() {
        return address;
    }
    
    

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cafeteriaweb.domain.Customer[ id=" + id + " ]";
    }
    
}
