package com.npci.Loan.Application.Controller;

import java.util.List;

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
import com.npci.Loan.Application.Entity.LoanApplicationEntity;

import com.npci.Loan.Application.Service.LoanApplicationService;
import com.npci.Loan.Application.Service.LoanService;

public@RestController
@CrossOrigin("*")
@RequestMapping("/application")
class LoanApplicationController {
        
	private final LoanApplicationService loanApplication;
	
	
	  @Autowired
	    public LoanApplicationController(LoanApplicationService loanApplication) {
	        this.loanApplication = loanApplication;
	    }
	  
	  
	   @PostMapping("/save")
	    public ResponseEntity<Object> saveCustomer(@RequestBody LoanApplicationEntity  loanApplicationEntity) {
	        Object obj = loanApplication.saveLoanApplication(loanApplicationEntity);
	        return new ResponseEntity<>(obj, HttpStatus.CREATED);
	    }
	   
	   
	   @GetMapping("/{customerId}")
	    public List<Object[]> getLoanStatusDetailsOfUser(@PathVariable int customerId) {
	    	System.out.println(customerId);
	        return loanApplication.getLoanStatusDetailsOfUser(customerId);
	    }
	   
	   
}
