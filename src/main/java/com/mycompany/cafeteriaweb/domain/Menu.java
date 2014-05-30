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
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Embedded
    FoodCategory foodcat;
    private Long id;
    private FoodCategory fooditem;
    
     private Menu(Builder build) {
        fooditem = build.fooditem;
    }

    private Menu() {

    }

    public static class Builder {

        private FoodCategory fooditem;

        public Builder(FoodCategory nam) {
                this.fooditem = nam;

        }
        public Builder Fooditem(FoodCategory nam) {
            this.fooditem =nam;
               return this;
        }

        public Builder() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        public Builder copy(Menu menu) {
            this.fooditem = menu.getFooditem();
            return this;
        }
         public Menu build() {
            return new Menu(this);
        }
    }
    
    public Long getId() {
        return id;
    }

    public FoodCategory getFooditem() {
        return fooditem;
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
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cafeteriaweb.domain.Menu[ id=" + id + " ]";
    }
    
}
