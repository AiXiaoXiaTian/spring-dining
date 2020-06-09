package com.yan.diningcustomer.service;

import com.yan.diningcustomer.entity.CusUser;
import com.yan.diningcustomer.mapper.CusUserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CusUserService {
    @Autowired
    CusUserMapper cusUserMapper;

    public CusUser loginByAccount(String account,String password){
        return cusUserMapper.findByAccountAndPassword(account, password);
    }
}