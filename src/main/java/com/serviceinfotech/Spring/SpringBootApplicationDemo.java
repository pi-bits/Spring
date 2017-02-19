package com.serviceinfotech.Spring;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApplicationDemo {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootApplicationDemo.class, args);
		 
        String[] beanNames = ctx.getBeanDefinitionNames();
         
        Arrays.sort(beanNames);
         
        for (String beanName : beanNames) 
        {
            System.out.println(beanName);
        }
        
        BridgeIGService bridgeIgService = (BridgeIGService)ctx.getBean("bridgeIGService");
        bridgeIgService.invoke("Prashant", "Naik");
		
	}
	
	

}
