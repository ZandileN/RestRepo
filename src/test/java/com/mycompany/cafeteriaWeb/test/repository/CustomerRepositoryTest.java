/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaWeb.test.repository;

import com.mycompany.cafeteriaweb.app.ConnectionConf;
import com.mycompany.cafeteriaweb.domain.Address;
import com.mycompany.cafeteriaweb.domain.Customer;

import com.mycompany.cafeteriaweb.repository.customerRespository;
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
public class CustomerRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;
    private customerRespository repo;
    
    public CustomerRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
 @Test
     public void createCustomer(){
     repo = ctx.getBean(customerRespository.class);
    Address address= new Address.Builder("87665")
                                 .Street("Langa 344")
                                 .city("Cape Town")
                                 .email("Zandile@gmail.com")
                                 .build();
     
     Customer cust= new Customer.Builder("Zandile")
                                        .lastname("Ngxumza")
                                        .Age(21)
                                        .Address(address)
                                        .build();
     
         //repoA.save(address);
//         id= address.getid();
         repo.save(cust);
         id = cust.getId();
         Assert.assertNotNull(cust);
         
     }
        
//     @Test(dependsOnMethods = "createCustomer")
//     public void readCustomer(){
//      repo = ctx.getBean(customerRespository.class);
//      
//       Customer store = repo.findOne(id);
//       Assert.assertEquals(store.getLastname(),"Ngxumza");   
//     }
//     @Test(dependsOnMethods = "readCustomer")
//     private void updateCustomer(){
//         repo = ctx.getBean(customerRespository.class);
//         Customer cust = repo.findOne(id);
//         cust.getLastname();
//         repo.save(cust);
//         
//         Customer updateCustomer = repo.findOne(id);   
//         Assert.assertEquals(updateCustomer.getLastname(), "Boniface");
//         
//     }
//      @Test(dependsOnMethods = "updateCustomer")
//     private void deleteCustomer(){
//         repo = ctx.getBean(customerRespository.class);
//         Customer cust = repo.findOne(id);
//         repo.delete(cust);
//         
//         Customer deletedCustomer = repo.findOne(id);
//         
//         Assert.assertNull(deletedCustomer);    
//     }
    @org.testng.annotations.BeforeClass
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
