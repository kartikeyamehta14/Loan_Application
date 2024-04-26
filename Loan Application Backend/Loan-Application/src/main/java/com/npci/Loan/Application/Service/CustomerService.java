package com.npci.Loan.Application.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.npci.Loan.Application.Entity.Customer;
import com.npci.Loan.Application.Repo.CustomerRepo;

@Service
public class CustomerService {
	  private final CustomerRepo customerRepository;

	    @Autowired
	    public CustomerService(CustomerRepo customerRepository) {
	        this.customerRepository = customerRepository;
	    }

	    public Customer saveCustomer(Customer customer) {
	        return customerRepository.save(customer);
	    }
	    
	    
	    
	   

	    public boolean authenticate(String email, String password) {
	        Customer customer = customerRepository.findByEmailId(email);

	        if (customer != null && customer.getPassword().equals(password)) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    
	    public Customer getCustomerDetailsByEmialId(@PathVariable ("email") String  email){
	    	Customer customer = customerRepository.findByEmailId(email);
			return customer;
	    	
	    }
}
