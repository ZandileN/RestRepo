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
public class MainMeal {
     private float Mprice;
     private String Mname;
    
    
    
      private MainMeal(Builder builder) {
        Mname = builder.Mname;
        Mprice= builder.Mprice;
    
    }
    private MainMeal() {
    }

    public static class Builder {
        private float Mprice;
        private String Mname;
       
        
         public Builder(String nm){
         this.Mname=nm;
         }
       
         public Builder Amountprice(float value){
          Mprice= value;
          return this;
         }
       
         public Builder copy(MainMeal meal){
          this.Mname=meal.getMname();
          this.Mprice=meal.getMprice();
          return this;
         }
         
         public MainMeal build(){
         return  new MainMeal(this);
         }    
    }
    public String getMname() {
        return Mname;
    }
    public float getMprice() {
        return Mprice;
    }
    
    
    
}
