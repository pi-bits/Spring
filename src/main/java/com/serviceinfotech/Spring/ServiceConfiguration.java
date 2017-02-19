package com.serviceinfotech.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {
	
	@Autowired
	CustomerDAO customerDao;
	
	@Bean
	public BridgeIGService bridgeIGService()
	{
		return new BridgeIGService("http://test.com",customerDao);
	}
	

}
