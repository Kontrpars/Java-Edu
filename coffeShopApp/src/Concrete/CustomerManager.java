package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;


public class CustomerManager implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) 
	{
		return true;
	}


}
