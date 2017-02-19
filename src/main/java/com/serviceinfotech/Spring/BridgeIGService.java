package com.serviceinfotech.Spring;

public class BridgeIGService {
	
	String endpointAddress;
	private CustomerDAO customerDao;
	
	public BridgeIGService(String endPointAddress,CustomerDAO customerDao) {
		this.endpointAddress = endPointAddress;
		this.customerDao = customerDao;

	}
	
	public void invoke(String firstName, String lastName)
	{
		System.out.println("*********BRIDGE IG SERVICE INVOKED*****");
		customerDao.saveCustomer(firstName, lastName);
		
		
	}

}
