/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.repository;

import com.mycompany.cafeteriaweb.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Sibakhulu
 */
@Repository
public interface customerRespository extends JpaRepository<Customer,Long>{
    
}
