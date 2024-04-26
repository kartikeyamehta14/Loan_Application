package com.npci.Loan.Application.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.Loan.Application.Entity.Customer;
import com.npci.Loan.Application.Entity.LoanApplicationEntity;
import com.npci.Loan.Application.Repo.CustomerRepo;
import com.npci.Loan.Application.Repo.LoanApplicationRepo;

@Service
public class LoanApplicationService {

	
	
	  private final LoanApplicationRepo applicationRepo;

    @Autowired
    public LoanApplicationService(LoanApplicationRepo applicationRepo) {
        this.applicationRepo = applicationRepo;
    }

    public Object 	saveLoanApplication(LoanApplicationEntity  loanApplicationEntity) {
        return applicationRepo.save(loanApplicationEntity);
    }
    
    
    
    
    public List<Object[]> getLoanStatusDetailsOfUser(int customerId) {
    	System.out.println(customerId);
        return applicationRepo.getLoanStatusDetailsOfUser(customerId);
    }
}
