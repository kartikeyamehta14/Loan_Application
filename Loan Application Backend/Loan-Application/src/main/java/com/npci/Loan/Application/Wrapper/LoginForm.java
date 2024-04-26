package com.npci.Loan.Application.Wrapper;

public class LoginForm {
    private String emailId;
    private String password;
	public LoginForm(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}
	public LoginForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginForm [emailId=" + emailId + ", password=" + password + "]";
	}

    // Getters and setters
    
}
