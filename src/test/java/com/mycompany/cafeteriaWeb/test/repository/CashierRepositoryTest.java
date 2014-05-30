/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaWeb.test.repository;

import com.mycompany.cafeteriaweb.app.ConnectionConf;
import com.mycompany.cafeteriaweb.domain.Address;
import com.mycompany.cafeteriaweb.domain.Cashier;
import com.mycompany.cafeteriaweb.repository.CashierRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sibakhulu
 */
public class CashierRepositoryTest {
     public static ApplicationContext ctx;
    private Long id;
    private CashierRepository repo;
    
    
    public CashierRepositoryTest() {
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createCashier() {
     repo = ctx.getBean(CashierRepository.class);
     //repoA= ctx.getBean(AddressRepository.class);
    Address address= new Address.Builder("87665")
                                 .Street("Langa 344")
                                 .city("Cape Town")
                                 .email("Zandile@gmail.com")
                                 .build();
     
     Cashier cashier= new Cashier.Builder()
                                 .name("Monica")
                                  .lastname("James")
                                  .address(address)
                                 .build();
         //repoA.save(address);
//         id= address.getid();
         repo.save(cashier);
         id = cashier.getId();
         Assert.assertNotNull(cashier);
         
     }
     
     

    @BeforeClass
    public static void setUpClass() throws Exception {
            ctx= new AnnotationConfigApplicationContext(ConnectionConf.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
