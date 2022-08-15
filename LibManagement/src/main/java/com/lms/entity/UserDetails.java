package com.lms.entity;

public class UserDetails {
	private int userId;
	private String userName;
	private String password;
	private String address;
	private int maxBookLimit;
	private int numberOfIssuedBooks;
	private String emailId;
	private String phoneNumber;
	
	
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserDetails(String userName, String password, String address, String emailId, String phoneNumber) {
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}
	public UserDetails(String userName, String password, String address, int maxBookLimit, int numberOfIssuedBooks,
			String emailId, String phoneNumber) {
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.maxBookLimit = maxBookLimit;
		this.numberOfIssuedBooks = numberOfIssuedBooks;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	//getter (to get the value of object instance) and 
	//setter (to set the value of object instance) methods
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMaxBookLimit() {
		return maxBookLimit;
	}
	public void setMaxBookLimit(int maxBookLimit) {
		this.maxBookLimit = maxBookLimit;
	}
	public int getNumberOfIssuedBooks() {
		return numberOfIssuedBooks;
	}
	public void setNumberOfIssuedBooks(int numberOfIssuedBooks) {
		this.numberOfIssuedBooks = numberOfIssuedBooks;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", password=" + password + ", address="
				+ address + ", maxBookLimit=" + maxBookLimit + ", numberOfIssuedBooks=" + numberOfIssuedBooks
				+ ", emailId=" + emailId + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	

}
