package com.npci.Loan.Application.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.Loan.Application.Entity.Customer;
import com.npci.Loan.Application.Service.CustomerService;
import com.npci.Loan.Application.Wrapper.LoginForm;

@RestController
@CrossOrigin("*")
@RequestMapping("/customer")
public class CustomerController {
       
	  private final CustomerService customerService;

	    @Autowired
	    public CustomerController(CustomerService customerService) {
	        this.customerService = customerService;
	    }

	    @PostMapping("/save")
	    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
	        Customer savedCustomer = customerService.saveCustomer(customer);
	        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
	    }
	    
	    

	    @PostMapping("/login")
	    public ResponseEntity<?> login(@RequestBody Customer customer) {
	        // You can implement authentication logic here
	        // For simplicity, let's assume you have a service method to validate credentials
	        boolean authenticated = customerService.authenticate(customer.getEmailId(), customer.getPassword());

	        if (authenticated) {
	            // If authentication is successful, return emailId in key-value pair
	            return ResponseEntity.ok().body(Map.of("message", "Login successful", "emailId", customer.getEmailId()));
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
	        }
	    }
	    
	    @GetMapping("/email/{emailId}")
	    public Customer getCustomerDetailsByEmialId(@PathVariable ("emailId") String  emailId){
	    	Customer customer = customerService.getCustomerDetailsByEmialId(emailId);
			return customer;
	    	
	    }
	
}
