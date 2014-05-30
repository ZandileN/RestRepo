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
public class Beverages {
    private String bname;
    private String btype;
    private double bprice;

     private Beverages(Builder builder) {
        bname = builder.bname;
        btype = builder.btype;
        bprice= builder.bprice;
    
    }

    private Beverages() {
    }

    public static class Builder {

        private String bname;
        private String btype;
        private double bprice;

        public Builder name(String name){
            
            return this;
        }
         public Builder type(String value) {
            btype = value;
            return this;
        }
         public Builder price(double value){
         bprice= value;
          return this;
         }
         public Beverages build(){
         return  new Beverages(this);
         }
         public Builder copy(Beverages meal){
          this.bname=meal.bname;
          this.bprice=meal.bprice;
          this.btype=meal.btype;
          return this;
         } 
 }

    public String getName() {
        return bname;
    }

    public String getType() {
        return btype;
    }

    public double getPrice() {
        return bprice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.btype != null ? this.btype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Beverages other = (Beverages) obj;
        if ((this.btype == null) ? (other.btype != null) : !this.btype.equals(other.btype)) {
            return false;
        }
        return true;
    }
    
}
