package coffeShopApp;

import Abstract.BaseCostumerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager basecustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		basecustomerManager.Save(new Customer(1,"Ahmet Eren", "Özkaya","12345","999999"));
	

	}

}

