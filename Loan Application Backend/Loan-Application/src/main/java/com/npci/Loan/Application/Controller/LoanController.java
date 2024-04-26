package com.npci.Loan.Application.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.Loan.Application.Service.CustomerService;
import com.npci.Loan.Application.Service.LoanService;

@RestController
@CrossOrigin("*")
@RequestMapping("/loan")
public class LoanController {
	
	
	private final LoanService loanService;
	
	  @Autowired
	    public LoanController(LoanService loanService) {
	        this.loanService = loanService;
	    }
	
	
	@GetMapping("/all")
	public Object getAllLoanDetials() {
		return loanService.getAllLoanDetials();
	}
	

}
