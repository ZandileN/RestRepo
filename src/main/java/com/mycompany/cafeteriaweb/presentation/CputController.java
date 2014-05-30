/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.cafeteriaweb.presentation;

import com.mycompany.cafeteriaweb.domain.Customer;
import com.mycompany.cafeteriaweb.services.CustomersAgeService;
import java.util.List;
//import javax.enterprise.inject.Model;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Sibakhulu
 */
@Controller
public class CputController {
    @Autowired
    private CustomersAgeService CustageService;
    @RequestMapping(value = "cput",method = RequestMethod.GET)
    public String getHome(){
        
        List<Customer> persons = CustageService.getAgeAbove(3);
        
        System.out.println(" The CPUT COntroller was hit" +persons.size());
        
        return "cput";
    }
    @RequestMapping(value = "cput/students",method = RequestMethod.GET)
    public String getStudents(Model model){
        
        
        model.addAttribute("name1", "This is a Student Name");
        
        return "students";
    }
    
}
