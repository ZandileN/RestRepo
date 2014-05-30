/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.services.Impl;

import com.mycompany.cafeteriaweb.domain.Supplier;
import com.mycompany.cafeteriaweb.repository.SupplierRepository;
import com.mycompany.cafeteriaweb.services.SupplierService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Sibakhulu
 */
public class SupplierImpl implements SupplierService {
    
    @Autowired
    private SupplierRepository supplier;
   
    @Override
    public List <Supplier> getSupplier(String name){
      List<Supplier> cashiers = new ArrayList<>();
        List<Supplier> allPersons = supplier.findAll();
        
         for (Supplier person : allPersons) {
            if (person.getName().endsWith(name)){
                cashiers.add(person);
            }
        }
        return cashiers;
 }
    @Override
    public List<Supplier> findAll() {
       return supplier.findAll();
    }

}
