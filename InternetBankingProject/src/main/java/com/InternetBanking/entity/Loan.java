package com.InternetBanking.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Loan {
	@Id
	@Column(name="loan_id")
	private int loanId;
	@Column(length = 15,name="amount_loan")
	private int loanAmount;
	@Column(name="loan_type",length = 50)
	private String loanType;
	@Column(length = 10)
	private boolean status;
	@OneToOne(mappedBy = "loan")
	private List<UserAccount> userAccount;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public List<UserAccount> getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(List<UserAccount> userAccount) {
		this.userAccount = userAccount;
	}
	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", loanAmount=" + loanAmount + ", loanType=" + loanType + ", status=" + status
				+ ", userAccount=" + userAccount + "]";
	}
	public Loan(int loanAmount, String loanType, boolean status, List<UserAccount> userAccount) {
		super();
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.status = status;
		this.userAccount = userAccount;
	}
	
	
	
	
	
}
