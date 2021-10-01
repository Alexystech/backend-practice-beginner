package com.slasher.backendpractice.bean.impl;

import com.slasher.backendpractice.bean.MyOperation;

public class MyOperationImpl implements MyOperation {

    @Override
    public int sumOne(int value) {
        return value + 1;
    }
}
