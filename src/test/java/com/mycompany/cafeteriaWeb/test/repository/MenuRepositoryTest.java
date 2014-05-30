/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaWeb.test.repository;

import com.mycompany.cafeteriaweb.app.ConnectionConf;
import com.mycompany.cafeteriaweb.domain.FoodCategory;
import com.mycompany.cafeteriaweb.domain.Menu;
import com.mycompany.cafeteriaweb.repository.MenuRepository;
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
public class MenuRepositoryTest {
    
    public static ApplicationContext ctx;
    private Long id;
    private MenuRepository repo;
    
    public MenuRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void createMenu(){
     repo = ctx.getBean(MenuRepository.class);
   FoodCategory cat= new FoodCategory.Builder("MainMeal").build();
     
     Menu menu= new Menu.Builder()
                    .Fooditem(cat)
                    .build();
         repo.save(menu);
        // id = menu.getId();
         Assert.assertNotNull(menu);
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
