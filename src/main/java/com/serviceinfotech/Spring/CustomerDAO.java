package com.serviceinfotech.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAO {
	private PersistenceService persistenceService;
	
	
	public CustomerDAO(PersistenceService persistenceService) {
		this.persistenceService = persistenceService;
	}
	
	
	
	public void saveCustomer(String firstName,String lastName)
	{
	persistenceService.save(firstName, lastName);
	}

}
