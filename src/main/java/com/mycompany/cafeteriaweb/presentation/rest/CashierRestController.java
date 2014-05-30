/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.presentation.rest;

import com.mycompany.cafeteriaweb.domain.Cashier;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Sibakhulu
 */
@Controller
@RequestMapping(value = "api/cashier")
public class CashierRestController {
    
    @RequestMapping(value = "create")
    @ResponseBody
    public String create(@RequestBody Cashier cashier) {
        System.out.println(" Create the Called ");
        return "";
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public String update(@RequestBody Cashier cashier) {
        System.out.println(" Update Called ");
        return "";
    }

    @RequestMapping(value = "club/{id}")
    @ResponseBody
    public Cashier getCashier(@PathVariable String id) {
        System.out.println(" ID called ");
        return null;
    }

    @RequestMapping(value = "clubs")
    @ResponseBody
    public List<Cashier> getCashier() {
        System.out.println("The CLUBS");
        return null;
    }

    @RequestMapping(value = "club/{name}")
    @ResponseBody
    public Cashier getCashierByName(@PathVariable String id) {
        System.out.println("The Club name");
        return null;
    }
    
}
