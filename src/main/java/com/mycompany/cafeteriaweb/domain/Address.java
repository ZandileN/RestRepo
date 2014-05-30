/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.domain;

import javax.persistence.Embeddable;

/**
 *
 * @author Sibakhulu
 */
@Embeddable
public class Address {
//    private Long id;
    private String street;
    private String city;
    private String postalCode;
    private String email;

     private Address(Builder builder) {
//         id= builder.id;
        street = builder.street;
        city = builder.city;
        postalCode = builder.postalCode;
        email=builder.email; 
    }

    private Address() {
    }

    public static class Builder {
        private Long id;
        private String street;
        private String city;
        private String  postalCode;
        private String email;

        public Builder(String post){
         this.postalCode=post;
        
        }
        public Builder Street(String value) {
            street = value;
            return this;
        }
        public Builder ID(Long i_d)
        {
            this.id=i_d;
            return this;
        }
          public Builder city(String value) {
            city = value;
            return this;
        }
           
           public Builder email(String value) {
            email = value;
            return this;
        }
       
        public Builder copy(Address ad){
            this.street= ad.street;
            this.city=ad.city;
            this.postalCode=ad.postalCode;
            this.email=ad.email;
            return this;
        }
         public Address build(){
            return new Address(this);
        }
    }
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getEmail() {
        return email;
    }
    
    
}
