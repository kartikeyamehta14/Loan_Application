package com.npci.Loan.Application.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Table(name = "LoanApplication")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoanApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private Long applicationId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "loan_id")
    private Long loanId;

    @Column(name = "status")
    private String status;

	public LoanApplicationEntity(Long applicationId, Long customerId, Long loanId, String status) {
		super();
		this.applicationId = applicationId;
		this.customerId = customerId;
		this.loanId = loanId;
		this.status = status;
	}

	public LoanApplicationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "LoanApplication [applicationId=" + applicationId + ", customerId=" + customerId + ", loanId=" + loanId
				+ ", status=" + status + "]";
	}
    
    
    
    

   
}

