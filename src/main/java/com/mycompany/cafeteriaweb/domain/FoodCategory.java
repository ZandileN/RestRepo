/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Embeddable;
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
public class FoodCategory implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
//    @Embedded
//    private MainMeal meal;
//    @Embedded
//    private Beverages beverages;
////    @Embedded
////    private Starter starter;
//    @Embedded
//    private FruitandVegetable fruitVeg;

    private FoodCategory(Builder builder) {
        id = builder.id;
        type = builder.type;
        //meal=builder.meal;
        //starter=builder.starter;
    }

    private FoodCategory() {
    }

    public static class Builder {

        private long id;
        private String type;
        private MainMeal meal;
        private Starter starter;
        private Beverages beverages;
        private FruitandVegetable fruitVeg;
        public Builder (String value) {
            type = value;
            
        }
       
        public Builder id(Long value) {
            id = value;
            return this;
        }
        
       public Builder meal(MainMeal meals){
         meal= meals;
         return this;
       }
        public Builder starters(Starter st){
         starter= st;
         return this;
       }
        public Builder beverages(Beverages val){
        beverages =val;
        return this;
        
        }
        public Builder FruitandVegetable(FruitandVegetable val)
        {
           fruitVeg=val;
            return this;
        
        }
//       
        public Builder copy(FoodCategory cat) {
            this.id=cat.getId();
            this.type = cat.getType();
            //this.meal= cat.getMeal();
           // this.starter= cat.getStarters();
           // this.fruitVeg=cat.getFruitVeg();
            return this;
        }
        public FoodCategory build() {
            return new FoodCategory(this);
        }

    }
   
    public Long getId() {
        return id;
    }
    
    public String getType(){
    return type;
    }
//    public MainMeal getMeal(){
//    return meal;
//    }
//    public Starter getStarters(){
//    return starter;
//    }

//    public Beverages getBeverages() {
//        return beverages;
//    }
//
//    public FruitandVegetable getFruitVeg() {
//        return fruitVeg;
//    }

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
        if (!(object instanceof FoodCategory)) {
            return false;
        }
        FoodCategory other = (FoodCategory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cafeteriaweb.domain.FoodCategory[ id=" + id + " ]";
    }
    
}
