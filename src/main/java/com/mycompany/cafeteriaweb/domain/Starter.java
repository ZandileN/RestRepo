/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.domain;

/**
 *
 * @author Sibakhulu
 */
public class Starter {
    private String sname;
    private String stype;
    private double sprice;
 
   private Starter(Builder builder) {
        sname = builder.sname;
        stype = builder.stype;
        sprice= builder.sprice;
    }

    private Starter() {
    }

    public static class Builder {
        private String sname;
        private String stype;
        private double sprice;

        public Builder name(String name){
            
            return this;
        }
         public Builder type(String value) {
            stype = value;
            return this;
        }
         public Builder price(double value){
          sprice= value;
          return this;
         }
         public Starter build(){
         return  new Starter(this);
         }
         public Builder copy(Starter st){
          this.sname=st.sname;
          this.sprice=st.sprice;
          this.stype=st.stype;
          return this;
         }
    }

    public String getName() {
        return sname;
    }

    public String getType() {
        return stype;
    }

    public double getPrice() {
        return sprice;
    }
}
