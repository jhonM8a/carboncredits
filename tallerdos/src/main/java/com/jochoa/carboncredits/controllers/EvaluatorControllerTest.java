package com.jochoa.carboncredits.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evaluatorservice")
public class EvaluatorControllerTest {

    @GetMapping("/hola")
    public void testservice(){
        System.out.println("----------------->");
    }

}
