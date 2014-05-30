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
public class Cashier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String Lastname;
    @Embedded
    private Address address;
    
    private Cashier(Builder builder) {
        id = builder.id;
        firstname = builder.firstname;
        Lastname=builder.lastname;
        address=builder.address;
    }
     private Cashier() {
    }

    public static class Builder {

        private long id;
        private String firstname;
        private String lastname;
        private Address address;
        
        public Builder name(String value) {
            firstname = value;
            return this;
        }
        public Builder lastname(String value){
          lastname= value;
          return this;
        } 
        public Builder address(Address ad){
         address=ad;
         return this;
        }
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
         
        public Cashier build(){
            return new Cashier(this);
        }
        public Builder copy(Cashier cashier){
            this.id=cashier.id;
            this.firstname=cashier.getFirstname();
            this.lastname=cashier.getLastname();
            this.address=cashier.getAddress();
            return this;
        }
    }

    public Long getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return Lastname;
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
        if (!(object instanceof Cashier)) {
            return false;
        }
        Cashier other = (Cashier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cafeteriaweb.domain.Cashier[ id=" + id + " ]";
    }
    
}
