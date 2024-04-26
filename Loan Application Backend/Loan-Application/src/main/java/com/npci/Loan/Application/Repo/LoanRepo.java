package com.npci.Loan.Application.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npci.Loan.Application.Entity.Customer;
import com.npci.Loan.Application.Entity.Loan;
@Repository
public interface LoanRepo  extends JpaRepository<Loan, Integer>{

	public List<Loan> findAll( );

}
