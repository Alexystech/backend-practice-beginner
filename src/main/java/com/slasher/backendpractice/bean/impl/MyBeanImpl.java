package com.slasher.backendpractice.bean.impl;

import com.slasher.backendpractice.bean.MyBean;

public class MyBeanImpl implements MyBean {

    @Override
    public String hello() {
        return "hello from MyBeanImpl";
    }
}
