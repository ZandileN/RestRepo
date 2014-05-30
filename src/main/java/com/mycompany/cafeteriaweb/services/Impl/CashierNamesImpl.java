/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.services.Impl;

import com.mycompany.cafeteriaweb.domain.Cashier;
import com.mycompany.cafeteriaweb.repository.CashierRepository;
import com.mycompany.cafeteriaweb.services.CashierNames;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sibakhulu
 */
@Service
public class CashierNamesImpl implements CashierNames{
    
    @Autowired
    private CashierRepository cashier;
    
    @Override
    public List <Cashier> getCashierNames(String name){
      List<Cashier> cashiers = new ArrayList<>();
        List<Cashier> allPersons = cashier.findAll();
        
         for (Cashier person : allPersons) {
            if (person.getLastname().endsWith(name)){
                cashiers.add(person);
            }
        }
        return cashiers;
 }
    @Override
    public List<Cashier> findAll() {
       return cashier.findAll();
    }
}
