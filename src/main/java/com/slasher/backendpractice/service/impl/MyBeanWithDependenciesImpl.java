package com.slasher.backendpractice.service.impl;

import com.slasher.backendpractice.bean.MyOperation;
import com.slasher.backendpractice.service.BeanWithDependencies;
import org.springframework.beans.factory.annotation.Autowired;

public class MyBeanWithDependenciesImpl implements BeanWithDependencies {

    private final MyOperation myOperation;

    @Autowired
    public MyBeanWithDependenciesImpl(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public int operationWithDependencies() {
        int value = 0;
        value = myOperation.sumOne(value);
        return value;
    }
}
