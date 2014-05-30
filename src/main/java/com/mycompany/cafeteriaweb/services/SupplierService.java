/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.services;

import com.mycompany.cafeteriaweb.domain.Supplier;
import java.util.List;

/**
 *
 * @author Sibakhulu
 */
public interface SupplierService {
    public List <Supplier> getSupplier(String name);
    public List<Supplier> findAll();
   // public List <Supplier> numberOfSuppliers();
}
