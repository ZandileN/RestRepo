/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.services;

import com.mycompany.cafeteriaweb.domain.Cashier;
import java.util.List;

/**
 *
 * @author Sibakhulu
 */
public interface CashierNames {
  
    public List <Cashier> getCashierNames(String name);
    public List<Cashier> findAll();
}
