package com.InternetBanking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan-table")
public class LoanBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	@Column(length = 100,name = "loanType")
	private String loanType;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public LoanBean(int loanId, String loanType) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
	}
	public LoanBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
