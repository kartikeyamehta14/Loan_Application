package com.npci.Loan.Application.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.Loan.Application.Entity.Customer;
import com.npci.Loan.Application.Repo.CustomerRepo;
import com.npci.Loan.Application.Repo.LoanRepo;

@Service
public class LoanService {

	
	  private final LoanRepo loanRepo;

	    @Autowired
	    public LoanService(LoanRepo loanRepo) {
	        this.loanRepo = loanRepo;
	    }

	    public Object getAllLoanDetials() {
	        return loanRepo.findAll();
	    }
}
