/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cafeteriaweb.domain;

import com.mycompany.cafeteriaweb.domain.Help.Builder;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Embedded;
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
public class Store implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String strname;
    private int hoursOpen;
    private String tel;
    @Embedded
    private Help help;
    @OneToMany
    @JoinColumn(name="cust_id")
    private List <Customer> customer;

    private Store(Builder builder) {
        id = builder.id;
        strname = builder.strname;
        hoursOpen = builder.hoursOpen;
        tel = builder.tel;
        help = builder.help;
        customer=builder.customer;
    }

    private Store() {
    }

    public static class Builder {

        private long id;
        private String strname;
        private int hoursOpen;
        private String tel;
        private Help help;
        private List <Customer> customer;

        public Builder(String value) {
            this.strname = value;
        }
        public Builder hoursOpen(int value) {
            hoursOpen = value;
            return this;
        }
        public Builder id(Long value) {
            id = value;
            return this;
        }
        public Builder tel(String value) {
            tel = value;
            return this;
        }
        public Builder help(Help value) {
            help = value;
            return this;
        }
        public Builder Customer(List <Customer> cust)
        {
         customer=cust;
         return this;
        
        }
        public Builder copy(Store store) {
            this.id=store.getId();
            this.strname = store.getName();
            this.hoursOpen = store.getHoursOpen();
            this.tel = store.getTel();
            this.help = store.getHelp();
            this.customer= store.getCustomer();
            return this;
        }
        
        public Store build() {
            return new Store(this);
        }

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return strname;
    }

    public int getHoursOpen() {
        return hoursOpen;
    }

    public String getTel() {
        return tel;
    }

    public Help getHelp() {
        return help;
    }
    public List <Customer> getCustomer() {
        return customer;
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
        if (!(object instanceof Store)) {
            return false;
        }
        Store other = (Store) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.cafeteriaweb.domain.Store[ id=" + id + " ]";
    }

}
