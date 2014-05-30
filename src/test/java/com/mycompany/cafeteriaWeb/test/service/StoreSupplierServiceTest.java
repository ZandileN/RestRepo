/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaWeb.test.service;

import com.mycompany.cafeteriaweb.domain.Store;
import com.mycompany.cafeteriaweb.repository.storeRepository;
import com.mycompany.cafeteriaweb.services.StoreSuppliersService;
import java.util.List;
import org.springframework.context.ApplicationContext;
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
public class StoreSupplierServiceTest {
    
    private static ApplicationContext ctx;
    private StoreSuppliersService peopleAgeService;
    private storeRepository personRepository;
    
    public StoreSupplierServiceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getStoreTel() {
        personRepository = ctx.getBean(storeRepository.class);
        peopleAgeService = ctx.getBean(StoreSuppliersService.class);
        
        Store p1 = new Store.Builder("b@k.com")
                .tel("0832076069").build();
        Store p2 = new Store.Builder("b1@k.com")
                .tel("123456").build();
        Store p3 = new Store.Builder("b2@k.com")
                .tel("45679").build();

        personRepository.save(p1);
        personRepository.save(p2);
        personRepository.save(p3);

        List<Store> people = peopleAgeService.getAllTel("123456");

        Assert.assertEquals(people.size(), 3);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
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
