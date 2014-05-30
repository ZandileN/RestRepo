/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.services.Impl;

import com.mycompany.cafeteriaweb.domain.Store;
import com.mycompany.cafeteriaweb.repository.storeRepository;
import com.mycompany.cafeteriaweb.services.StoreSuppliersService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sibakhulu
 */
@Service
public class StoreSupplierImpl implements StoreSuppliersService{
    
  @Autowired
  storeRepository storerepository;
  
   @Override
    public List<Store> getAllTel(String tel) {
        List<Store> persons = new ArrayList<>();
        List<Store> allPersons = storerepository.findAll();

        for (Store person : allPersons) {
            if (person.getTel().equalsIgnoreCase(tel)) {
                persons.add(person);
            }
        }
        return persons;
    }
    @Override
    public List<Store> findAll() {
       return storerepository.findAll();
    }
  
  
}
