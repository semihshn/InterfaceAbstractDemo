package Business;

import Entities.Customer;

public class CustomerManager implements CustomerService{
	
	private CustomerCheckService checkService;
	
	public CustomerManager(CustomerCheckService checkService) {
		// TODO Auto-generated constructor stub
		this.checkService=checkService;
	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		if (checkService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db : "+customer.getFirstName());
		} else {
			System.out.println("Customer is not valid");
		}
		
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Updated to db : "+customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Deleted to db : "+customer.getFirstName());
		
	}

}
