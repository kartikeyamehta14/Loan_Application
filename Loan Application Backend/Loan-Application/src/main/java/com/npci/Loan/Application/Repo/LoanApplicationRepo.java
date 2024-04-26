package com.npci.Loan.Application.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.npci.Loan.Application.Entity.LoanApplicationEntity;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationEntity, Integer> {
	
	
	@Query(value="SELECT a.application_id, a.customer_id, a.loan_id, a.status, t.loan_type " +
            "FROM loanapplication AS a INNER JOIN loan AS t " +
            "ON a.loan_id = t.loan_id " +
            "WHERE a.customer_id = :customer_id", nativeQuery = true)
public List<Object[]> getLoanStatusDetailsOfUser(@Param("customer_id") int customer_id);


}
