///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
//package com.mycompany.cafeteriaweb.app;
//
//import javax.servlet.ServletRegistration;
//import org.springframework.context.annotation.ComponentScan.Filter;
//import org.springframework.web.filter.CharacterEncodingFilter;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
///**
// *
// * @author Sibakhulu
// */
//public class WebApplInitializer  extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//    
//
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class<?>[] {ConnectionConf.class};
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[] {WebMvcConfig.class};
//    }
//
//    @Override
//    protected Filter[] getServletFilters() {
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setEncoding("UTF-8");
//        characterEncodingFilter.setForceEncoding(true);
//
//      
//
//        return new Filter[] {characterEncodingFilter};
//    }
//
//    @Override
//    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
//        registration.setInitParameter("defaultHtmlEscape", "true");
//        registration.setInitParameter("spring.profiles.active", "default");
//    }
//    
//}
