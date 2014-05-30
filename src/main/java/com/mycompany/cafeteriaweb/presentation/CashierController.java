/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.presentation;

import com.mycompany.cafeteriaweb.domain.Cashier;
import com.mycompany.cafeteriaweb.services.CashierNames;
import com.mycompany.cafeteriaweb.services.CashierService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Sibakhulu
 */
@Controller
public class CashierController {
    
    @Autowired
    private CashierNames cashierService;

    @Autowired
    private CashierService cashierServices;

    @RequestMapping(value = "person")
    @ResponseBody
    public Cashier getCashier() {
        Cashier cas = null;
        List<Cashier> cashiers = cashierService.findAll();

        System.out.println(" THE COllection Size" + cashiers.size());

        if (cashiers.size() > 0) {
            cas = cashiers.get(0);

        }

        return cas;
    }
}
