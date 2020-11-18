package CollectionFramework.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListOfCustomers {
  
  
  public static void main(String[] args) {
	
	ArrayList<Customers> customers = new ArrayList();
	
	Customers cust = new Customers();
	cust.setId(101);
	cust.setName("Test One");
	cust.setActive(true);
	cust.setTotalPurchase(1299.89F);
	
	customers.add(cust);
	customers.add(new Customers(202, "Test Two", false, 2399.66F));
	customers.add(new Customers(202, "Test Two", false, 2399.66F));
	customers.add(new Customers(202, "Test Two", false, 2399.66F));
	System.out.println(customers);
	
	
	//Using set we can remove duplicate values
	
	Set<Customers> customersSet = new HashSet<>();
	customersSet.add(cust);
	customersSet.add(cust);
	System.out.println(customersSet);
	
	
  }
}
