/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
//package com.mycompany.cafeteriaWeb.test.restapi;
//
//import com.mycompany.cafeteriaweb.domain.Cashier;
//import java.net.URL;
//import java.util.Collections;
//import javax.ws.rs.HttpMethod;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.web.client.RestTemplate;
//import static org.testng.Assert.*;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
///**
// *
// * @author Sibakhulu
// */
//public class CashierRestControllerTest {
//    private RestTemplate restTemplate;
//    private final static String URL = "http://localhost:8084/askweb/";
//    
//  
//     @Test
//     public void testCreate(){
//       Cashier cas =null;
//        HttpEntity<Cashier> requestEntity = new HttpEntity<>(cas, getContentType());
////        Make the HTTP POST request, marshaling the request to JSON, and the response to a String
//        ResponseEntity <String> responseEntity = restTemplate.
//                exchange(URL+"api/person/create", HttpMethod.POST, requestEntity, String.class);
// }
//     public void testRead(){
//     HttpEntity<?> requestEntity = getHttpEntity();
//       ResponseEntity<Cashier[]> responseEntity = restTemplate.exchange("URL",HttpMethod.GET,requestEntity, Cashier[].class);
//        
//        Cashier [] people = responseEntity.getBody();
//        for (Cashier person : people) {
//     }
//     }
//      private HttpEntity<?> getHttpEntity(){
//         HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.setAccept(Collections.singletonList(new MediaType("application","json")));
//        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
//        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//        return requestEntity;
//    }
//    
//    private HttpHeaders getContentType() {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.setContentType(new MediaType("application", "json"));
//        return requestHeaders;
//    }
//}
