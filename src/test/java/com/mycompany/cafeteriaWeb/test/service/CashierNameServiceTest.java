/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaWeb.test.service;

import com.mycompany.cafeteriaweb.app.ConnectionConf;
import com.mycompany.cafeteriaweb.domain.Cashier;
import com.mycompany.cafeteriaweb.repository.CashierRepository;
import com.mycompany.cafeteriaweb.services.CashierNames;
import java.util.List;
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
public class CashierNameServiceTest {
    
    private static ApplicationContext ctx;
    private CashierNames cashierNamesService;
    private CashierRepository cashierRepository;
    
    public CashierNameServiceTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test(enabled=false)
     public void getCashierNames(){
        cashierRepository = ctx.getBean(CashierRepository.class);
        cashierNamesService = ctx.getBean(CashierNames.class);
        
        Cashier p1 = new Cashier.Builder()
                .lastname("a").build();
        Cashier p2 = new Cashier.Builder()
                .lastname("b").build();
        Cashier p3 = new Cashier.Builder()
                .lastname("c").build();

        cashierRepository.save(p1);
        cashierRepository.save(p2); 
        cashierRepository.save(p3);

        List<Cashier> people = cashierNamesService.getCashierNames("a");

        Assert.assertEquals(people.size(), 3);

         
     
     }
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConf.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
       cashierRepository = ctx.getBean(CashierRepository.class);
       cashierRepository.deleteAll();
    }
}
