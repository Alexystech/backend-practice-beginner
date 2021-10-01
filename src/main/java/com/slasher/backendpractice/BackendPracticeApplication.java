package com.slasher.backendpractice;

import com.slasher.backendpractice.bean.ActionBean;
import com.slasher.backendpractice.bean.MyBean;
import com.slasher.backendpractice.component.MyComponent;
import com.slasher.backendpractice.service.BeanWithDependencies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendPracticeApplication implements CommandLineRunner {

	private MyBean myBean;
	private MyComponent myComponent;
	private BeanWithDependencies beanWithDependencies;
	private ActionBean actionBean;

	@Autowired
	public BackendPracticeApplication(
			MyBean myBean
			, @Qualifier("myComponentBeanThree") MyComponent myComponent
			, BeanWithDependencies beanWithDependencies
			, ActionBean actionBean) {
		this.myBean = myBean;
		this.myComponent = myComponent;
		this.beanWithDependencies = beanWithDependencies;
		this.actionBean = actionBean;
	}

	public static void main(String[] args) {
		SpringApplication.run(BackendPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(myBean.hello());
		myComponent.printSomething();
		System.out.println(beanWithDependencies.operationWithDependencies());
		actionBean.start();
	}
}
