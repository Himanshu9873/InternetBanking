package com.InternetBanking.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="account_open")
public class UserAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 12,name="account_id")
	private int id;
	@Column(length = 50,name = "firstName")
	private String firstName;
	@Column(length = 50,name="lastName")
	private String lastName;
	@Column(length = 400,name="address")
	private String address;
	@Column(length = 100,name="password")
	private String password;
	@Column(length = 50,name = "email")
	private String email;
	@Column(length = 12,name="phone")
	private String phone;
	@Column(length = 12,name = "aadhar_card")
	private String adharCard;
	@Column(length = 12,name = "pan_card")
	private String panCard;
	@Column(length = 20,name="userType")
	private String userType;
	@Column(length = 10,name="account_No")
	private int account_no;
	@OneToOne
	@JoinColumn(name="credit_card_id")
	private List<CreditCardsBean> cardBean;
	@OneToOne
	@JoinColumn(name="debit_card_id")
	private List<DebitCardBean> debitcardDetails;
	@OneToOne
	@JoinColumn(name="loan_id")
	private List<Loan> loan;
	@Temporal(value = TemporalType.TIMESTAMP)
	private String dateOfRegistration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(String adharCard) {
		this.adharCard = adharCard;
	}
	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public List<CreditCardsBean> getCardBean() {
		return cardBean;
	}
	public void setCardBean(List<CreditCardsBean> cardBean) {
		this.cardBean = cardBean;
	}
	public List<DebitCardBean> getDebitcardDetails() {
		return debitcardDetails;
	}
	public void setDebitcardDetails(List<DebitCardBean> debitcardDetails) {
		this.debitcardDetails = debitcardDetails;
	}
	public List<Loan> getLoan() {
		return loan;
	}
	public void setLoan(List<Loan> loan) {
		this.loan = loan;
	}
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", password=" + password + ", email=" + email + ", phone=" + phone + ", adharCard=" + adharCard
				+ ", panCard=" + panCard + ", userType=" + userType + ", account_no=" + account_no + ", cardBean="
				+ cardBean + ", debitcardDetails=" + debitcardDetails + ", loan=" + loan + ", dateOfRegistration="
				+ dateOfRegistration + "]";
	}
	public UserAccount(String firstName, String lastName, String address, String password, String email, String phone,
			String adharCard, String panCard, String userType, int account_no, List<CreditCardsBean> cardBean,
			List<DebitCardBean> debitcardDetails, List<Loan> loan, String dateOfRegistration) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.adharCard = adharCard;
		this.panCard = panCard;
		this.userType = userType;
		this.account_no = account_no;
		this.cardBean = cardBean;
		this.debitcardDetails = debitcardDetails;
		this.loan = loan;
		this.dateOfRegistration = dateOfRegistration;
	}
	public UserAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
