package com.slasher.backendpractice.component.impl;

import com.slasher.backendpractice.component.MyComponent;
import org.springframework.stereotype.Component;

@Component
public class MyComponentBeanTwo implements MyComponent {

    @Override
    public void printSomething() {
        System.out.println("imprimiendo algo desde MyComponentBeanTwo");
    }
}
