/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.services.Impl;

import com.mycompany.cafeteriaweb.domain.Customer;
import com.mycompany.cafeteriaweb.repository.customerRespository;
import com.mycompany.cafeteriaweb.services.CustomersAgeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Sibakhulu
 */
public class CustomerAgeImpl implements CustomersAgeService{
      @Autowired
    private customerRespository customerRepository;

    @Override
    public List<Customer> getAgeAbove(int age) {

        List<Customer> customers = new ArrayList<>();
        List<Customer> allPersons = customerRepository.findAll();

        for (Customer person : allPersons) {
            if (person.getAge() > age) {
                customers.add(person);
            }
        }
        return customers;
    }

    @Override
    public List<Customer> findAll() {
       return customerRepository.findAll();
    }
    
}
