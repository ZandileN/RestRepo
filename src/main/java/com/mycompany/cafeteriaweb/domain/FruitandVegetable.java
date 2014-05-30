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
public class FruitandVegetable {
    private String fvname;
    private String fvtype;
    private double fvprice;

    private FruitandVegetable(){}
     private FruitandVegetable(Builder build){
         
         fvname=build.fvname;
         fvtype=build.fvtype;
         fvprice=build.fvprice;
}
   public static class Builder{
       private String fvname;
       private String fvtype;
       private double fvprice;
       
    
    public Builder name(String nam){
        fvname= nam;
        return this;
    }
     public Builder Type(String typ){
       fvtype=typ;
       return this;
       }
    public Builder price(double p){
      fvprice=p;
      return this;
    }
   
    public FruitandVegetable build(){
       return new FruitandVegetable(this);
       } 
    public Builder copy(FruitandVegetable fveg){
        this.fvname=fveg.fvname;
        this.fvprice=fveg.fvprice;
        this.fvtype=fveg.fvtype;
        return this;
        
    }}

    public String getName() {
        return fvname;
    }

    public String getType() {
        return fvtype;
    }

    public double getPrice() {
        return fvprice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.fvname != null ? this.fvname.hashCode() : 0);
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
        final FruitandVegetable other = (FruitandVegetable) obj;
        if ((this.fvname == null) ? (other.fvname != null) : !this.fvname.equals(other.fvname)) {
            return false;
        }
        return true;
    }
}
