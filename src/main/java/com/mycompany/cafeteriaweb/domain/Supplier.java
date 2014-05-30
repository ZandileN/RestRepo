/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author Sibakhulu
 */
@Entity
public class Supplier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany
   @JoinColumn(name="store_id")
    private List <Store> store;
    
    
private Supplier(Builder builder) {
        id = builder.id;
        name = builder.name;
        store=builder.store;
} 
        private Supplier() {
        }
      public static class Builder {

        private long id;
        private String name;
        private List <Store> store;

        public Builder name(String value) {
            name = value;
            return this;
        }
         public Builder store(List <Store> value) {
            store = value;
            return this;
        }
        
        public Builder id(Long value) {
            id = value;
            return this;
        }
         
        public Supplier build(){
            return new Supplier(this);
        }
        public Builder copy(Supplier sup){
            this.id=sup.getId();
            this.name=sup.getName();
            this.store=sup.getStore();
            return this;
        }
    }

    public Long getId() {
        return id;
    }

    public String getName(){
    return name;
    }
    public List<Store> getStore(){
    return store;
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
        if (!(object instanceof Supplier)) {
            return false;
        }
        Supplier other = (Supplier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cafeteriaweb.domain.Supplier[ id=" + id + " ]";
    }
    
}
