package com.serviceinfotech.Spring;

import org.springframework.stereotype.Service;

@Service
public class PersistenceService {
	
	public void save(String firstName ,String lastName)
	{
		System.out.println(" ****Persistence Service called .. \n"  + firstName + "  " + lastName + "\n Details Saved .. ");
		
	}
}
