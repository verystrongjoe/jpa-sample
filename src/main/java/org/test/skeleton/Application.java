package org.test.skeleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@EnableAutoConfiguration
@ComponentScan
//@EnableJpaRepositories(basePackages = "org.test.skeleton")
//@EntityScan(basePackages = "org.test.skeleton")
//@RestController
public class Application {
	
//	 @RequestMapping("/")
//	    public String home() {
//	        return "Hello World";
//	    }
	 
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}