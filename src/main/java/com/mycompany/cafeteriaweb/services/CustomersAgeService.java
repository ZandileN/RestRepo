/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.services;

import com.mycompany.cafeteriaweb.domain.Customer;
import java.util.List;

/**
 *
 * @author Sibakhulu
 */
public interface CustomersAgeService {
     public List<Customer> getAgeAbove(int i);

    public List<Customer> findAll();
}
