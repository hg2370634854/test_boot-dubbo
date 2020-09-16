package com.hg.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hg.dubbo.bean.UserAddress;
import com.hg.dubbo.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String uid) {

        UserAddress user2=new UserAddress();
        user2.setAddress("浙江省绍兴市");
        user2.setId("2");

        return Arrays.asList(user2);
    }
}
