package com.slasher.backendpractice.component.impl;

import com.slasher.backendpractice.component.MyComponent;
import org.springframework.stereotype.Component;

@Component
public class MyComponentBeanThree implements MyComponent {

    @Override
    public void printSomething() {
        System.out.println("this is another text lmao");
    }
}
