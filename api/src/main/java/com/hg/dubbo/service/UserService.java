package com.hg.dubbo.service;


import com.hg.dubbo.bean.UserAddress;

import java.util.List;

public interface UserService {

    List<UserAddress> getUserAddressList(String uid);
}
