/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.services;

import com.mycompany.cafeteriaweb.domain.Store;
import java.util.List;

/**
 *
 * @author Sibakhulu
 */
public interface StoreSuppliersService {
    
     public List<Store> getAllTel(String i);
     public List<Store> findAll();
    
    
}
