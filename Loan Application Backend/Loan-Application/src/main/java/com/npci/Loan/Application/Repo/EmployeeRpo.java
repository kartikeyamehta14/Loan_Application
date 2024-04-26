package com.npci.Loan.Application.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npci.Loan.Application.Entity.Employee;

public interface EmployeeRpo extends JpaRepository<Employee,Integer> {

}
