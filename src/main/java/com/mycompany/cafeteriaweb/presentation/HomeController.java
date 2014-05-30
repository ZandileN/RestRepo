/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.presentation;

import com.mycompany.cafeteriaweb.domain.Cashier;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 *@author Sibakhulu
 */
@Controller
public class HomeController {
    
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }
    
    @RequestMapping(value = "/rest",method = RequestMethod.GET)
    @ResponseBody
    public List<Cashier> getRndex(){
        List<Cashier> cashiers = new ArrayList<>();
        Cashier p1 = new Cashier.Builder()
                     .lastname("Simps").build();
        Cashier p2 = new Cashier.Builder()
                .lastname("Jacobs").build();
        Cashier p3 = new Cashier.Builder()
                .lastname("abc").build();
        cashiers.add(p3);
        cashiers.add(p1);
        cashiers.add(p2);
        
        return cashiers;
    }
    

    
}
