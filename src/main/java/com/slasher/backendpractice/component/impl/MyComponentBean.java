package com.slasher.backendpractice.component.impl;

import com.slasher.backendpractice.component.MyComponent;
import org.springframework.stereotype.Component;

@Component
public class MyComponentBean implements MyComponent {

    @Override
    public void printSomething() {
        System.out.println("imprimiendo algo de MyComponentBean");
    }
}
