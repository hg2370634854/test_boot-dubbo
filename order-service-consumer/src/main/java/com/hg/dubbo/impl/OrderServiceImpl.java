package com.hg.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.hg.dubbo.bean.UserAddress;
import com.hg.dubbo.service.OrderService;
import com.hg.dubbo.service.UserService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    UserService userService;
    @Override

    public void initOrder(String uid) {
        System.out.println("_________________uid:"+uid);
        List<UserAddress> list=userService.getUserAddressList(uid);
        System.out.println(list);
    }
}
