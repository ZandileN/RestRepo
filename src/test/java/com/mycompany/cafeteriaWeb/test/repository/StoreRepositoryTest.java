/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaWeb.test.repository;

import com.mycompany.cafeteriaweb.app.ConnectionConf;
import com.mycompany.cafeteriaweb.domain.Help;
import com.mycompany.cafeteriaweb.domain.Store;
import com.mycompany.cafeteriaweb.repository.storeRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;

import org.testng.annotations.Test;

/**
 *
 * @author Sibakhulu
 */
public class StoreRepositoryTest {
    public static ApplicationContext ctx;
    private Long id;
    private storeRepository repo;
    
    
    public StoreRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
     public void createStore(){
     repo = ctx.getBean(storeRepository.class);
     Help help= new Help.Builder("What is the store")
                        .build();
    
     Store store= new Store.Builder("Zandile")
                                    .hoursOpen(8)
                                    .tel("0216879")
                                    .help(help)
                                    .build();
         repo.save(store);
         id = store.getId();
         Assert.assertNotNull(store);
     }
     
//     @Test(dependsOnMethods = "createStore")
//     public void readStore(){
//      repo = ctx.getBean(storeRepository.class);
//       Store store = repo.findOne(id);
//       //Assert.assertEquals(store.getName(),"Zandile");
//       Assert.assertEquals(store.getName(),"Zandile");
// }
     
//     @Test (dependsOnMethods = "readStore")
//     public void updateStore(){
//         repo = ctx.getBean(storeRepository.class);
//         Store store = repo.findOne(id);
//         Store updatestore = new Store.Builder("hello")
//                                      .copy(store)
//                                      .tel("0412839").build();
////         store.getTel();
//         repo.save(store);
//         
//         //Store updateStore = repo.findOne(id);   
//         Assert.assertEquals(store.getId(),updatestore.getId());
//         
//     }
//      @Test(dependsOnMethods = "updateStore")
//     private void deleteStore(){
//         repo = ctx.getBean(storeRepository.class);
//         Store store = repo.findOne(id);
//         repo.delete(store);
//         
//         Store deletedStore = repo.findOne(id);
//         
//         Assert.assertNull(deletedStore);    
//     }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        
        ctx= new AnnotationConfigApplicationContext(ConnectionConf.class);
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
