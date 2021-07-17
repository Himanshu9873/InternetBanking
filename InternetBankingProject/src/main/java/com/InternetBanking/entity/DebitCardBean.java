package com.InternetBanking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "debit_card")
public class DebitCardBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 12,name = "card_number")
	private int cardNo;
	@Column(length = 100,name = "dr_holder_name")
	private String cardHolderName;
	@Column(length = 12,unique = true)
	private int accountNo;
	@Column(name = "dr_issueDate")
	@Temporal(value= TemporalType.TIMESTAMP)
	private String issueDate;
	@Temporal(value = TemporalType.TIMESTAMP)
	private String expiryDate;
	@Column(name = "account_balance")
	private int balance;
	@Column(name = "rate_of_interest")
	private float interestRate;
	@Column(unique = true)
	private int pin;
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public DebitCardBean(String cardHolderName, int accountNo, String issueDate, String expiryDate, int balance,
			float interestRate, int pin) {
		super();
		this.cardHolderName = cardHolderName;
		this.accountNo = accountNo;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		this.balance = balance;
		this.interestRate = interestRate;
		this.pin = pin;
	}
	public DebitCardBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DebitCardBean [cardNo=" + cardNo + ", cardHolderName=" + cardHolderName + ", accountNo=" + accountNo
				+ ", issueDate=" + issueDate + ", expiryDate=" + expiryDate + ", balance=" + balance + ", interestRate="
				+ interestRate + ", pin=" + pin + "]";
	}
	
	
}
