package com.ekart.order.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {


    @GetMapping("/ordermsg")
    public String getOrderMsg(){
        return "Welcome order service";
    }
}
