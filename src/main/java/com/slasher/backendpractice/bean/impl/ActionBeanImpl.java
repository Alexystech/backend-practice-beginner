package com.slasher.backendpractice.bean.impl;

import com.slasher.backendpractice.bean.ActionBean;

public class ActionBeanImpl implements ActionBean {

    @Override
    public void start() {
        System.out.println("starting...");
    }
}
