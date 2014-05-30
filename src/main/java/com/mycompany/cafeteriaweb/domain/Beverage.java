///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.mycompany.cafeteriaweb.domain;
//
//import java.io.Serializable;
//import javax.persistence.Embeddable;
//
///**
// *
// * @author Sibakhulu
// */
//@Embeddable
//public class Beverage implements Serializable{
//    private String name;
//    private String type;
//    private double price;
//
//     private Beverage(Builder builder) {
//        name = builder.name;
//        type = builder.type;
//        price= builder.price;
//    
//    }
//
//    private Beverage() {
//    }
//
//    public static class Builder {
//
//        private String name;
//        private String type;
//        private double price;
//
//        public Builder name(String name){
//            
//            return this;
//        }
//         public Builder type(String value) {
//            type = value;
//            return this;
//        }
//         public Builder price(double value){
//          price= value;
//          return this;
//         }
//         public Beverage build(){
//         return  new Beverage(this);
//         }
//         public Builder copy(Beverage meal){
//          this.name=meal.name;
//          this.price=meal.price;
//          this.type=meal.type;
//          return this;
//         } 
// }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public double getPrice() {
//        return price;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 29 * hash + (this.type != null ? this.type.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Beverage other = (Beverage) obj;
//        if ((this.type == null) ? (other.type != null) : !this.type.equals(other.type)) {
//            return false;
//        }
//        return true;
//    }
//    
//
//    
//}
