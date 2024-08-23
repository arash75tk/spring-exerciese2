package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyinjectionApplication.class, args);
		@SuppressWarnings("resource")
	    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_test.xml");
	    
		dependencyinjectionseter dependencyinjectionseter = context.getBean(dependencyinjectionseter.class);
		dependencyinjectionseter.dosomething();

	}

}
