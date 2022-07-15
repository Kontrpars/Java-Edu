
  package Abstract;

import Entities.Customer;

public abstract class BaseCostumerManager implements ICustomer{
  
  @Override 
  public void Save(Customer customer) {
  
  System.out.println("Saved to db : " + customer.firstName );
 
 
 }
  
  }
 