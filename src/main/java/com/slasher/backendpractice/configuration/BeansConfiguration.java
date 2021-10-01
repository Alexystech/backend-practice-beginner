package com.slasher.backendpractice.configuration;

import com.slasher.backendpractice.bean.ActionBean;
import com.slasher.backendpractice.bean.MyOperation;
import com.slasher.backendpractice.bean.impl.ActionBeanImpl;
import com.slasher.backendpractice.bean.impl.MyOperationImpl;
import com.slasher.backendpractice.service.BeanWithDependencies;
import com.slasher.backendpractice.service.impl.MyBeanWithDependenciesImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    public BeanWithDependencies beanWithDependencies(MyOperation myOperation) {
        return new MyBeanWithDependenciesImpl(myOperation);
    }

    @Bean
    public MyOperation beanOperation() {
        return new MyOperationImpl();
    }

    @Bean
    public ActionBean actionBean() {
        return new ActionBeanImpl();
    }
}
