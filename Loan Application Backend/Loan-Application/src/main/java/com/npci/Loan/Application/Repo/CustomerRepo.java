package com.npci.Loan.Application.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.npci.Loan.Application.Entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer , Integer> {
	 Customer findByEmailId(String emailId);
}
