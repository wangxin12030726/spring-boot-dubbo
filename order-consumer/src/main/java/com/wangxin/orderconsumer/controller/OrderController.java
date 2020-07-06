package com.wangxin.orderconsumer.controller;

import com.wangxin.orderconsumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/test")
    private String test(){
        return orderService.getUserName();
    }
}
