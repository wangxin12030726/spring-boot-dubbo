package com.wangxin.orderconsumer.service.impl;

import com.wangxin.common.service.UserService;
import com.wangxin.orderconsumer.service.OrderService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Reference
    private UserService userService;
    @Override
    public String getUserName() {
        return userService.findUserName();
    }
}
