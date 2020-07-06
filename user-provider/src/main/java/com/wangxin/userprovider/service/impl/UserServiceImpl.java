package com.wangxin.userprovider.service.impl;

import com.wangxin.common.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String findUserName() {
        return "spring boot dubbo";
    }
}
