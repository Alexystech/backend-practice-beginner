package com.slasher.backendpractice.configuration;

import com.slasher.backendpractice.bean.MyBean;
import com.slasher.backendpractice.bean.impl.MyBeanImpl;
import com.slasher.backendpractice.bean.impl.MyBeanTwoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GeneralConfiguration {

    @Bean
    public MyBean myBean() {
        return new MyBeanTwoImpl();
    }

}
